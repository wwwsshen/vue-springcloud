package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0204Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0204.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;

/**
 * MH0204: 门户网站 - 门户前台（首页）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0204: 门户网站 - 门户前台（首页）")
@RequestMapping("/MH0204")
public class MH0204Controller extends APIController {

    /**
     * MH0204Service
     */
    private final MH0204Service mh0204Service;

    @Autowired
    public MH0204Controller(MH0204Service mh0204Service) {
        this.mh0204Service = mh0204Service;
    }

    /**
     * A01: 导航栏列表获取（获取导航栏列表，包含二级目录）
     */
    @ApiOperation(value = "导航栏列表获取", notes = "获取导航栏列表，包含二级目录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    @ApiImplicitParam(dataType = "MH0204A01InputDTO", name = "input", value = "请求参数")
    public JSONResult A01(@Valid MH0204A01InputDTO input) {
        JSONResult<List<MH0204A01DTO>> jsonResult = new JSONResult<>();
        List<MH0204A01DTO> mh0204A01DTOList = new ArrayList<>();

        // TODO 业务逻辑: A01: 导航栏列表获取（获取导航栏列表，包含二级目录）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0204A01DTOList);
        return jsonResult;
    }

    /**
     * A02: 导航栏新增提交（导航栏新增提交）
     */
    @ApiOperation(value = "导航栏新增提交", notes = "导航栏新增提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    @ApiImplicitParam(dataType = "MH0204A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0204A02InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A02: 导航栏新增提交（导航栏新增提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A03: 导航栏详细数据获取（获取导航栏详细数据）
     */
    @ApiOperation(value = "导航栏详细数据获取", notes = "获取导航栏详细数据", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    @ApiImplicitParam(dataType = "MH0204A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0204A03InputDTO input) {
        JSONResult<MH0204A03DTO> jsonResult = new JSONResult<>();
        MH0204A03DTO mh0204A03DTO = new MH0204A03DTO();

        // TODO 业务逻辑: A03: 导航栏详细数据获取（获取导航栏详细数据）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0204A03DTO);
        return jsonResult;
    }

    /**
     * A04: 导航栏编辑提交（导航栏编辑提交）
     */
    @ApiOperation(value = "导航栏编辑提交", notes = "导航栏编辑提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0204A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0204A04InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A04: 导航栏编辑提交（导航栏编辑提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A05: 导航栏删除（删除导航栏）
     */
    @ApiOperation(value = "导航栏删除", notes = "删除导航栏", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    @ApiImplicitParam(dataType = "MH0204A05InputDTO", name = "input", value = "请求参数")
    public JSONResult A05(@Valid MH0204A05InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A05: 导航栏删除（删除导航栏）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }
}
