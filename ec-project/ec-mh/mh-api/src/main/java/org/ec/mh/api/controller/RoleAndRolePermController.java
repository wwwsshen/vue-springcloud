package org.ec.mh.api.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.ec.mh.dto.LimitShowDTO;
import org.ec.mh.dto.RoleAndPermDTO;
import org.ec.mh.entity.LoginInfoDTO;
import org.ec.mh.service.ModuleService;
import org.ec.mh.service.RoleAndRolePermService;
import org.ec.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.alibaba.fastjson.JSONObject;

/**
 * @author zx
 * */

@RestController
@CrossOrigin
@Api("Role: 角色管理")
@RequestMapping("/Role")
//@Authorization
public class RoleAndRolePermController {
	//@Resource(name="roleAndRolePermService")

	//private RoleAndRolePermService roleAndRolePermService;

	/**
	 * RoleAndRolePermService
	 */
	private final RoleAndRolePermService roleAndRolePermService;

	@Autowired
	public RoleAndRolePermController(RoleAndRolePermService roleAndRolePermService) {
		this.roleAndRolePermService = roleAndRolePermService;
	}
	
	/**
	 * 新增角色
	 * */
	@RequestMapping(value="/role", method=RequestMethod.POST)

	public ResponseEntity<String> addRoleAndRolePerm(
			@Validated(GroupForAdd.class)
					RoleAndPermDTO roleAndPermDTO, BindingResult rpErros,
			String pointList,
			@Validated
					LoginInfoDTO loginInfoDTO, BindingResult liErros) {

		if(rpErros.hasErrors() || liErros.hasErrors())
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();

		if(roleAndRolePermService.addRoleAndRolePerm(roleAndPermDTO, loginInfoDTO,pointList))
			return ResponseUtil.getResEntityForPPPWhenSuccess();
		
		return ResponseUtil.getResEntityForPPPWhenFail();
	}
	
	/**
	 * 修改角色
	 * */
	@RequestMapping(value="/updateRole", method=RequestMethod.PUT)

	public ResponseEntity<String> updateRoleAndRolePerm(
			@Validated(GroupForUpdate.class)
			RoleAndPermDTO roleAndPermDTO, BindingResult rpErros,
			String pointList,
			@Validated
			LoginInfoDTO loginInfoDTO, BindingResult liErros) {
		
		if(rpErros.hasErrors() || liErros.hasErrors())
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();	
	
		if(roleAndRolePermService.updateRoleAndRolePerm(roleAndPermDTO, loginInfoDTO,pointList))
			return ResponseUtil.getResEntityForPPPWhenSuccess();
		
		return ResponseUtil.getResEntityForPPPWhenFail();
	}

	/**
	 * 通过id删除角色
	 * */
	public ResponseEntity<String> deleteRoleById() {
		
		
		return null;
	}
	
	/**
	 * 通过id数组删除角色
	 * */
	@RequestMapping(value="/rolesDel", method=RequestMethod.POST)

	public ResponseEntity<String> deleteRoleByIds(
			@RequestParam("roleIds")
			String[] roleIds) {
		if(roleIds == null || 0 == roleIds.length)
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();
		
		return ResponseUtil.getResEntityForGetAndJson(roleAndRolePermService.deleteRoleByIds(roleIds));
	}
	
	/**
	 * 通过id查询角色以及角色权限
	 * */
	@RequestMapping(value="/role/{id}", method=RequestMethod.GET)
	public ResponseEntity<String> findRoleAndPermById(
			@PathVariable("id")
			String roleId,
			@Validated
			LoginInfoDTO loginInfoDTo, BindingResult liErros) {
		if(StringUtil.isNullOrEmpty(roleId) || liErros.hasErrors())
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();
		
		Map<String, Object> rs = roleAndRolePermService.findRoleAndPermById(roleId, loginInfoDTo);
		if(rs == null)
			return ResponseUtil.getResEntityForGet();
		
		JSONObject json = new JSONObject(rs);
		return ResponseUtil.getResEntityForGet(json.toJSONString());
	}
	
	/**
	 * 通过条件查询角色
	 * */
	@RequestMapping(value="/roles", method=RequestMethod.GET)
	public ResponseEntity<String> findRolesWithLimit(
			String roleName,
			LimitShowDTO limitShowDTO, BindingResult errors,
			LoginInfoDTO loginInfoDTO) {
		
		if(errors.hasErrors())
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();
		
		List<Map<String, Object>> roles = roleAndRolePermService.findRolesWithLimit(roleName, limitShowDTO,loginInfoDTO.getCurOrgId());
		
		return ResponseUtil.getResEntityForGetAndJsonArray(roles);
	}
	
	/**
	 * 获取角色总数
	 * */
	@RequestMapping(value="/roles/count", method=RequestMethod.GET)
	public ResponseEntity<String> findCountOfRolesWithLimit(String roleName, LoginInfoDTO loginInfoDTO) {
		JSONObject json = new JSONObject();
		json.put("total", roleAndRolePermService.findCountOfRoles(roleName, loginInfoDTO.getCurOrgId()));
		
		return ResponseUtil.getResEntityForGet(json.toJSONString());
	}
	
	
	@RequestMapping(value="/authorityList", method=RequestMethod.GET)
	public ResponseEntity<String> authorityList(
			LoginInfoDTO loginInfoDTO) {
		List<Map<String, Object>> list =null;
		if(loginInfoDTO.getCurRoleType().endsWith(SystemConstants.PM_ROLE_TYPE)){
			list=roleAndRolePermService.authorityList(SystemConstants.PM_ROLE_ID);
		}else if(loginInfoDTO.getCurRoleType().endsWith(SystemConstants.OM_ROLE_TYPE)){
			list=roleAndRolePermService.authorityList(SystemConstants.OM_ROLE_ID);
		}else{
			list=roleAndRolePermService.authorityList(SystemConstants.BLOC_ROLE_ID);
		}
		
		
		return ResponseUtil.getResEntityForGetAndJsonArray(list);
	}
	
	/**
	 * 根据当前登录用户的组织结构id查询所有末级模块和权限点
	 * @author ljl
	 * */
	@RequestMapping(value="/permissionPointAll", method=RequestMethod.GET)
	public ResponseEntity<String> findPointsAll(
			String org,LoginInfoDTO loginInfo) {
		
		if (StringUtil.isNullOrEmpty(org))
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();
		
		List<Map<String, Object>> rs = roleAndRolePermService.findPermissionPointByOrg(org, loginInfo);
		
		return ResponseUtil.getResEntityForGetAndJsonArray(rs);
		
	}
	
	/**
	 * 根据查询所有末级模块和权限点角色id
	 * @author ljl
	 * */
	@RequestMapping(value="/permissionPointByOwner", method=RequestMethod.GET)
	public ResponseEntity<String> findPoints(
			String roleId,
			@Validated
			LoginInfoDTO loginInfoDTo, BindingResult liErros) {
		if(StringUtil.isNullOrEmpty(roleId) || liErros.hasErrors())
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();
		
		List<Map<String, Object>> rs = roleAndRolePermService.findPermissionPointByRole(roleId, loginInfoDTo);
		
		return ResponseUtil.getResEntityForGetAndJsonArray(rs);
		
	}
	
	/**
	 * 根据角色查询选择的权限
	 * @author ljl
	 * */
	@RequestMapping(value="/permissionPointList", method=RequestMethod.GET)
	public ResponseEntity<String> findPointsList(
			String roleId,
			@Validated
			LoginInfoDTO loginInfoDTo, BindingResult liErros) {
		if(StringUtil.isNullOrEmpty(roleId) || liErros.hasErrors())
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();
		
		List<Map<String, Object>> rs = roleAndRolePermService.findPermissionPointList(roleId, loginInfoDTo);
		
		return ResponseUtil.getResEntityForGetAndJsonArray(rs);
		
	}
	
	/**
	 * 根据角色查询选择的权限和模块详情
	 * @author ljl
	 * */
	@RequestMapping(value="/permissionPointDetail", method=RequestMethod.GET)
	public ResponseEntity<String> getPointsListDetail(
			String roleId,
			@Validated
			LoginInfoDTO loginInfoDTo, BindingResult liErros) {
		if(StringUtil.isNullOrEmpty(roleId) || liErros.hasErrors())
			return ResponseUtil.getResponseEntityWhenInvalidReqParams();
		
		List<Map<String, Object>> rs = roleAndRolePermService.getPermissionPointDetail(roleId, loginInfoDTo);
		
		return ResponseUtil.getResEntityForGetAndJsonArray(rs);
		
	}
}
