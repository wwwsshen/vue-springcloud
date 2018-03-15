package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0201Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0201.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;

/**
 * MH0201: 门户网站 - 门户后台（文章管理）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0201: 门户网站 - 门户后台（文章管理）")
@RequestMapping("/MH0201")
public class MH0201Controller extends APIController {

    /**
     * MH0201Service
     */
    private final MH0201Service mh0201Service;

    @Autowired
    public MH0201Controller(MH0201Service mh0201Service) {
        this.mh0201Service = mh0201Service;
    }

    /**
     * A01: 文章新建提交（文章新建提交）
     */
    @ApiOperation(value = "文章新建提交", notes = "文章新建提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A01")
    @ApiImplicitParam(dataType = "MH0201A01InputDTO", name = "input", value = "请求参数")
    public JSONResult A01(@Valid MH0201A01InputDTO input) {
        JSONResult<MH0201A01DTO> jsonResult = new JSONResult<>();
        MH0201A01DTO mh0201A01DTO = new MH0201A01DTO();

        // TODO 业务逻辑: A01: 文章新建提交（文章新建提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0201A01DTO);
        return jsonResult;
    }

    /**
     * A02: 文章列表获取（分页&查询）（获取文章里列表，包含分页和查询）
     */
    @ApiOperation(value = "文章列表获取（分页&查询）", notes = "获取文章里列表，包含分页和查询", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    @ApiImplicitParam(dataType = "MH0201A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0201A02InputDTO input) {
        JSONResult<List<MH0201A02DTO>> jsonResult = new JSONResult<>();
        List<MH0201A02DTO> mh0201A02DTOList = new ArrayList<>();

        // TODO 业务逻辑: A02: 文章列表获取（分页&查询）（获取文章里列表，包含分页和查询）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0201A02DTOList);
        return jsonResult;
    }

    /**
     * A03: 文章删除（删除指定ID得文章）
     */
    @ApiOperation(value = "文章删除", notes = "删除指定ID得文章", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    @ApiImplicitParam(dataType = "MH0201A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0201A03InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A03: 文章删除（删除指定ID得文章）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A04: 文章编辑提交（编辑文章后提交）
     */
    @ApiOperation(value = "文章编辑提交", notes = "编辑文章后提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0201A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0201A04InputDTO input) {
        JSONResult<MH0201A04dto> jsonResult = new JSONResult<>();
        MH0201A04dto mh0201A04dto = new MH0201A04dto();

        // TODO 业务逻辑: A04: 文章编辑提交（编辑文章后提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0201A04dto);
        return jsonResult;
    }

    /**
     * A05: 文章编辑数据获取（获取文章详细数据）
     */
    @ApiOperation(value = "文章编辑数据获取", notes = "获取文章详细数据", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A05")
    @ApiImplicitParam(dataType = "MH0201A05InputDTO", name = "input", value = "请求参数")
    public JSONResult A05(@Valid MH0201A05InputDTO input) {
        JSONResult<MH0201A05DTO> jsonResult = new JSONResult<>();
        MH0201A05DTO mh0201A05DTO = new MH0201A05DTO();

        // TODO 业务逻辑: A05: 文章编辑数据获取（获取文章详细数据）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0201A05DTO);
        return jsonResult;
    }
}
