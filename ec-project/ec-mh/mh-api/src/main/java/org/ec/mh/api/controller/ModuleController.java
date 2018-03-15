package org.ec.mh.api.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.ec.mh.dto.MH0101.MH0101A01DTO;
import org.ec.mh.dto.ModuleDTO;
import org.ec.mh.service.MH0101Service;
import org.ec.mh.service.ModuleService;
import org.ec.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 模块管理
 */
@RestController
@CrossOrigin
@Api("module: 模块管理")
@RequestMapping("/module")
public class ModuleController {
    /**
     * ModuleService
     */
    private final ModuleService moduleService;

    @Autowired
    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    /**
     * addModule: 导航栏数据获取（获取导航栏的数据，可包含二级目录）
     */
    @ApiOperation(value = "新增模块", notes = "新增模块", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/addModule")
    public ResponseEntity<String> addModule(@Validated(GroupForAdd.class)
                                                    ModuleDTO moduleDTO, BindingResult errors,
                                            String operationJsonString) {
        //如果有错
        if(errors.hasErrors())
            return ResponseUtil.getResponseEntityWhenInvalidReqParams();
        if(StringUtil.isNullOrEmpty(operationJsonString))
            return ResponseUtil.getResponseEntityWhenInvalidReqParams();
        if(moduleService.addModule(moduleDTO,operationJsonString))
            return ResponseUtil.getResEntityForPPPWhenSuccess();

        return ResponseUtil.getResEntityForPPPWhenFail();

    }

    /**
     * 根据id删除该ID以及所有孩子
     */
    @RequestMapping(value="/deleteByIdsAndChild",method = RequestMethod.GET)
    public ResponseEntity<String> deleteByIdsAndChild(
            @RequestParam("moduleCode")
                    String[] moduleCode){
        if(moduleCode == null || 0 == moduleCode.length)
            return ResponseUtil.getResponseEntityWhenInvalidReqParams();
        if(moduleService.deleteByIdsAndChild(moduleCode))
            return ResponseUtil.getResEntityForPPPWhenSuccess();

        return ResponseUtil.getResEntityForPPPWhenFail();
    }

    /**
     * 更新模块
     */
    @RequestMapping(value="/updateModule",method = RequestMethod.PUT)

    public ResponseEntity<String> updateModule(
            @Validated(GroupForUpdate.class)
                    ModuleDTO moduleDTO,BindingResult errors,
            String operationJsonString){
        //如果有错
        if(errors.hasErrors())
            return ResponseUtil.getResponseEntityWhenInvalidReqParams();
        if(StringUtil.isNullOrEmpty(operationJsonString))
            return ResponseUtil.getResponseEntityWhenInvalidReqParams();
        if(moduleService.updateModule(moduleDTO,operationJsonString))
            return ResponseUtil.getResEntityForPPPWhenSuccess();

        return ResponseUtil.getResEntityForPPPWhenFail();
    }

    @RequestMapping(value="/searchModule",method = RequestMethod.GET)
    public ResponseEntity<String> searchMoudle(
            String moduleId
    ){
        //如果有错
        if(StringUtil.isNullOrEmpty(moduleId))
            return ResponseUtil.getResponseEntityWhenInvalidReqParams();
        Map<String, Object> modules = moduleService.searchModuleById(moduleId);
        if(modules!=null)
            return ResponseUtil.getResEntityForGet(new JSONObject(modules).toJSONString());

        return ResponseUtil.getResEntityForPPPWhenFail();
    }
}
