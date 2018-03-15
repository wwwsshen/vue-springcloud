package org.ec.mh.service.impl;

import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.Authorization;
import org.ec.mh.dao.mapper.ModuleMapper;
import org.ec.mh.dao.mapper.ModuleMapperExtra;
import org.ec.mh.dao.mapper.PermissionPointMapperExtra;
import org.ec.mh.dao.mapper.SidebarMapper;
import org.ec.mh.dto.LimitShowDTO;
import org.ec.mh.dto.ModuleDTO;
import org.ec.mh.dto.PermissionPointDTO;
import org.ec.mh.entity.LoginInfoDTO;
import org.ec.mh.entity.Module;
import org.ec.mh.service.ModuleService;
import org.ec.mh.service.RoleAndRolePermService;
import org.ec.mh.service.SidebarService;
import org.ec.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.*;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ModuleServiceImpl implements ModuleService{
    @Resource(name="moduleMapperExtra")
    private ModuleMapperExtra moduleMapperExtra;

    @Resource(name="permissionPointMapperExtra")
    private PermissionPointMapperExtra permissionPointMapperExtra;

    @Resource(name="moduleMapper")
    private ModuleMapper moduleMapper;

    @Resource(name="sidebarMapper")
    private SidebarMapper sidebarMapper;

    //@Resource(name = "sidebarService")
    @Autowired
    private SidebarService sidebarService;

    //@Resource(name="roleAndRolePermService")
    @Autowired
    private RoleAndRolePermService roleService;

    private static final String SYSTEM_NAME = "desk"; //系统参数我的中心模块

    /**
     * 模块查找
     */
    public Map<String, Object> searchModuleById(String moduleId){
        Map<String, Object> modules = moduleMapperExtra.search(moduleId);
        if(modules.size()==0)
            return null;
        return modules;
    }

    /**
     * 模块修改
     */
    public boolean updateModule(ModuleDTO moduleDTO, String operationJsonString){
        Module module = moduleDTO.toModule();
        //更新信息
        moduleMapper.updateByPrimaryKeySelective(module);

        //更新权限点
        updatePermissionPoint(moduleDTO,operationJsonString);

        return true;
    }

    /**
     * 模块新增
     */
    @Override
    public boolean addModule(ModuleDTO moduleDTO,String operations) {
        if (StringUtil.isNullOrEmpty(moduleDTO.getParentCode()))
            moduleDTO.setParentCode(null);

        Map<String, Object> maxCode = moduleMapperExtra.findMaxCodeByParentCode(moduleDTO.getParentCode());

        Module module = moduleDTO.toModule();
        module.setId(StringUtil.createTimestamp());
        if(maxCode !=null && !maxCode.isEmpty())
            module.setModuleCode(BeanUtil.getTreeCode(maxCode.get("maxCode").toString()));
        else
            module.setModuleCode(BeanUtil.getTreeCodeForInit(moduleDTO.getParentCode()));
        module.setHasChild(SystemConstants.FALSE_0);

        //生成层级
        int level = creatLevel0(moduleDTO.getParentCode());
        module.setLevel0(level);
        //生成是否有孩子
        module.setHasChild((byte)0);
        int newOrder = getMaxShowOrder(moduleDTO.getParentCode());
        module.setShowOrder(newOrder);
        if(moduleMapper.insertSelective(module)<=0)
            return false;
        setParentHasChild(moduleDTO.getParentCode(), (byte) 1);

        //新增权限点
        addPermissionPoint(module.getModuleCode(),operations);

        return true;
    }

    /**
     * 模块删除
     */
    @Override
    public boolean deleteByIdsAndChild(String[] codes) {
        int rs = moduleMapperExtra.deleteByParent(codes);
        rs += permissionPointMapperExtra.deleteByParent(codes);

        return rs > 1;
    }

    /**
     * 新增的时候寻找最大的序号
     */
    private int getMaxShowOrder(String parent){
        int num = 0;
        Map<String, Object> findOrder = moduleMapperExtra.findModule(parent);
        if(findOrder != null && !findOrder.isEmpty())
            num = Integer.parseInt(findOrder.get("showOrder").toString())+1;

        return num;
    }

    /**
     * 模块列表中数据上移
     */

    public boolean moveUp(int showOrder,String id,String parentCode){
        if (StringUtil.isNullOrEmpty(parentCode))
            parentCode = null;

        Map<String, Object> biggerData = moduleMapperExtra.findBigger(showOrder,parentCode);
        if(biggerData == null || biggerData.isEmpty())
            return false;

        return swapShowOrder(id,showOrder,biggerData.get("id").toString(),Integer.parseInt(biggerData.get("show_order").toString()));
    }

    /**
     * 交换需要上移或下移的两个showOrder的值
     */
    //@Authorization
    private boolean swapShowOrder(String id, int showOrder, String otherId,
                                  int otherShowOrder) {
        Module module = getModuelForShowOrder(id, otherShowOrder);
        Module otherModule = getModuelForShowOrder(otherId, showOrder);

        return moduleMapper.updateByPrimaryKeySelective(module) > 0
                && moduleMapper.updateByPrimaryKeySelective(otherModule) > 0;
    }

    private Module getModuelForShowOrder(String id, int showOrder) {
        Module module = new Module();
        module.setId(id);
        module.setShowOrder(showOrder);

        return module;
    }

    /**
     * 模块列表中数据下移
     */
    @Override
    public boolean moveDown(int showOrder, String id, String parentCode) {
        if (StringUtil.isNullOrEmpty(parentCode))
            parentCode = null;

        Map<String, Object> smallerData = moduleMapperExtra.findSmaller(showOrder,parentCode);
        if(smallerData == null || smallerData.isEmpty())
            return false;
        return swapShowOrder(id,showOrder,smallerData.get("id").toString(),Integer.parseInt(smallerData.get("show_order").toString()));
    }

    /**
     * 进入下一级目录
     */
    @Override
    public List<Map<String, Object>> goNextCatalog(String parentCode,LimitShowDTO limitShowDTO){
        List<Map<String,Object>> modules = moduleMapperExtra.goNextPage(parentCode, limitShowDTO.calculateStart(), limitShowDTO.calculateEnd());
        System.out.println(modules);
        if (modules.size() > 0) {
            return modules;
        } else {
            return null;
        }
    }

    /**
     * 进入下一级目录并查询进入后符合的数据条数(该方法已失效，无用)
     */
    @Override
    public Object goNextCatalogNum(String parentCode){
        List<Map<String, Object>> modules =
                moduleMapperExtra.goNextPage(parentCode, -1, -1);
        return modules == null ? 0 : modules.size();
    }

    /**
     * 根据parentCode生成level0
     * */
    //@Authorization
    private int creatLevel0(String parentCode) {
        if (moduleMapperExtra.selectLevel0(parentCode).length==0)
            return 0;
        String []level0 = moduleMapperExtra.selectLevel0(parentCode);
        return Integer.parseInt(level0[0]);
    }

    /**
     * 修改父节点的hasChild属性
     * */
    private void setParentHasChild(String parentCode,Byte hasChild) {
        if (parentCode != null)
            moduleMapperExtra.updateHasChild(parentCode, hasChild);
    }

    /**
     * 查找模块的数量
     */
    @Override
    public Object findCountOfModules(String moduleName,String parentCode) {
        List<Map<String, Object>> modules =
                moduleMapperExtra.findModulesWithLimit(moduleName,parentCode, -1, -1);
        return modules == null ? 0 : modules.size();
    }

    /**
     * 根据条件查找模块
     */
    @Override
    public List<Map<String, Object>> findModulesWithLimit(String moduleName,String parentCode,
                                                          LimitShowDTO limitShowDTO) {

        return moduleMapperExtra.
                findModulesWithLimit(moduleName,parentCode, limitShowDTO.calculateStart(), limitShowDTO.calculateEnd());
    }

    /**
     * 判断模块名是否重复
     * */
    @Override
    public boolean judgeRepition(String moduleName) {
        if (moduleMapperExtra.judgeRepition(moduleName) == null || moduleMapperExtra.judgeRepition(moduleName).size() == 0)
            return true;

        return false;
    }

    @Override
    public List<Map<String, Object>> findModules(String moduleName,String level,
                                                 LimitShowDTO limitShowDTO) {
        return moduleMapperExtra.findModules(moduleName,level,limitShowDTO.calculateStart(), limitShowDTO.calculateEnd());
    }

    @Override
    public Object searchModuleCount(String moduleName,String parentCode) {
        List<Map<String, Object>> modules =
                moduleMapperExtra.searchModuleCount(moduleName,parentCode, -1, -1);
        return modules == null ? 0 : modules.size();
    }

    @Override
    public List<Map<String, Object>> getModuleCodes(LoginInfoDTO loginInfoDTO) {
        return moduleMapperExtra.getModuleCodes(loginInfoDTO.getCurUserid(), SYSTEM_NAME);
    }

    @Override
    public List<Map<String, Object>> getPageNavigation(String parentCode,
                                                       LoginInfoDTO loginInfoDTO) {

        return moduleMapperExtra
                .getPageNavigation(parentCode, loginInfoDTO.getCurUserid(),
                        roleService.getRolesByUserId(loginInfoDTO.getCurUserid()));
    }

    /**
     * 获取角色管理的列表数据
     */
    @Override
    public List<Map<String, Object>> getModuleForRole(String orgCode, LoginInfoDTO loginInfoDTO) {
        return sidebarService.findModuelsByOrg(orgCode, loginInfoDTO, Constant.LIST_FORMAT);
    }

    private void addPermissionPoint(String moduleCode,String operations){
        JSONArray array = JSONUtil.parseForegroundJSONArrayStr(operations);
        List<PermissionPointDTO> list =new ArrayList<PermissionPointDTO>();
        for(int i= 0;i<array.size();i++){
            PermissionPointDTO p = (PermissionPointDTO)JSONObject.toJavaObject(array.getJSONObject(i), PermissionPointDTO.class);
            p.setId(StringUtil.createTimestamp());
            p.setModuleCode(moduleCode);
            list.add(p);
        }

        permissionPointMapperExtra.insert(list);
    }

    @Override
    public boolean validateSame(String code) {
        return permissionPointMapperExtra.validateSame(code) == 0;
    }

    @Override
    public List<Map<String, Object>> getPermissionPoint(String moduleId) {
        return permissionPointMapperExtra.getPermissionPoint(moduleId);
    }

    private void updatePermissionPoint(ModuleDTO moduleDTO,String operations){
        /*JSONArray array = JSONUtil.parseForegroundJSONArrayStr(operations);
        List<PermissionPointDTO> addList =new ArrayList<PermissionPointDTO>();
        List<PermissionPointDTO> updateList =new ArrayList<PermissionPointDTO>();
        List<Map<String,Object>> del = permissionPointMapperExtra.getPermissionPoint(moduleDTO.getModuleId());
        for(int i= 0;i<array.size();i++){
            PermissionPointDTO p = (PermissionPointDTO) JSONPObject.toJavaObject(array.getJSONObject(i), PermissionPointDTO.class);
            if(p.getId()==null){
                p.setId(StringUtil.createTimestamp());
                p.setModuleCode(moduleDTO.getModuleCode());
                addList.add(p);
            }
            else{
                updateList.add(p);
            }

            if(p.getId()!=null){
                needDel(p.getId(),del);
            }
        }
        delById(del);
        if(updateList.size()>0)
            permissionPointMapperExtra.update(updateList);
        if(addList.size()>0)
            permissionPointMapperExtra.insert(addList);*/

    }

    private void needDel(String id,List<Map<String,Object>> list){
        for(int i=0;i<list.size();i++){
            if(id.equals(list.get(i).get("id").toString())){
                list.remove(i);
            }
        }
    }

    private void delById(List<Map<String,Object>> list){
        String[] ids = new String[list.size()];
        for(int i=0;i<list.size();i++){
            ids[i] = list.get(i).get("id").toString();
        }
        if(ids.length >0)
            permissionPointMapperExtra.deleteById(ids);
    }

    @Override
    public List<Map<String, Object>> getPointByRoleAndModule(String moduleCode,
                                                             LoginInfoDTO loginInfoDTO) {
        /*String[] ids =roleService.getRolesByUserId(loginInfoDTO.getCurUserid());
        if(ids == null) return null;
        return permissionPointMapperExtra.getPointByRoleAndModule(ids, moduleCode);*/
        return null;
    }
}
