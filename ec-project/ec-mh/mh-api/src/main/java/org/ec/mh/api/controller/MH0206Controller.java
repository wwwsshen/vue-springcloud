package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0206Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0206.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * MH0206: 门户网站 - 门户后台（办事服务入口）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0206: 门户网站 - 门户后台（办事服务入口）")
@RequestMapping("/MH0206")
public class MH0206Controller extends APIController {

    /**
     * MH0206Service
     */
    private final MH0206Service mh0206Service;

    @Autowired
    public MH0206Controller(MH0206Service mh0206Service) {
        this.mh0206Service = mh0206Service;
    }

    /**
     * A01: 办事服务入口列表获取（获取办事服务入口列表）
     */
    @ApiOperation(value = "办事服务入口列表获取", notes = "获取办事服务入口列表", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01() {
        JSONResult<MH0206A01DTO> jsonResult = new JSONResult<>();
        MH0206A01DTO mh0206A01DTO = new MH0206A01DTO();

        // TODO 业务逻辑: A01: 办事服务入口列表获取（获取办事服务入口列表）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0206A01DTO);
        return jsonResult;
    }

    /**
     * A02: 办事服务入口新增提交（办事服务入口新增提交）
     */
    @ApiOperation(value = "办事服务入口新增提交", notes = "办事服务入口新增提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    @ApiImplicitParam(dataType = "MH0206A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0206A02InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A02: 办事服务入口新增提交（办事服务入口新增提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A03: 办事服务入口详细数据获取（根据ID办事服务入口详细数据）
     */
    @ApiOperation(value = "办事服务入口详细数据获取", notes = "根据ID办事服务入口详细数据", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    @ApiImplicitParam(dataType = "MH0206A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0206A03InputDTO input) {
        JSONResult<MH0206A03DTO> jsonResult = new JSONResult<>();
        MH0206A03DTO mh0206A03DTO = new MH0206A03DTO();

        // TODO 业务逻辑: A03: 办事服务入口详细数据获取（根据ID办事服务入口详细数据）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0206A03DTO);
        return jsonResult;
    }

    /**
     * A04: 办事服务入口编辑提交（办事服务入口编辑提交）
     */
    @ApiOperation(value = "办事服务入口编辑提交", notes = "办事服务入口编辑提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0206A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0206A04InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A04: 办事服务入口编辑提交（办事服务入口编辑提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A05: 办事服务入口删除（根据ID删除办事服务入口）
     */
    @ApiOperation(value = "办事服务入口删除", notes = "根据ID删除办事服务入口", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    @ApiImplicitParam(dataType = "MH0206A05InputDTO", name = "input", value = "请求参数")
    public JSONResult A05(@Valid MH0206A05InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A05: 办事服务入口删除（根据ID删除办事服务入口）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }
}
