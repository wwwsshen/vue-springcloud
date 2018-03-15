package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0205Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0205.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;

/**
 * MH0205: 门户网站 - 门户后台（友情链接）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0205: 门户网站 - 门户后台（友情链接）")
@RequestMapping("/MH0205")
public class MH0205Controller extends APIController {

    /**
     * MH0205Service
     */
    private final MH0205Service mh0205Service;

    @Autowired
    public MH0205Controller(MH0205Service mh0205Service) {
        this.mh0205Service = mh0205Service;
    }

    /**
     * A01: 友情链接列表获取（获取友情链接列表）
     */
    @ApiOperation(value = "友情链接列表获取", notes = "获取友情链接列表", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01() {
        JSONResult<List<MH0205A01DTO>> jsonResult = new JSONResult<>();
        List<MH0205A01DTO> mh0205A01DTOList = new ArrayList<>();

        // TODO 业务逻辑: A01: 友情链接列表获取（获取友情链接列表）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0205A01DTOList);
        return jsonResult;
    }

    /**
     * A02: 友情链接新增提交（友情链接新增提交）
     */
    @ApiOperation(value = "友情链接新增提交", notes = "友情链接新增提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    @ApiImplicitParam(dataType = "MH0205A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0205A02InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A02: 友情链接新增提交（友情链接新增提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A03: 友情链接详细数据获取（根据ID获取友情链接详细数据）
     */
    @ApiOperation(value = "友情链接详细数据获取", notes = "根据ID获取友情链接详细数据", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    @ApiImplicitParam(dataType = "MH0205A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0205A03InputDTO input) {
        JSONResult<MH0205A03DTO> jsonResult = new JSONResult<>();
        MH0205A03DTO mh0205A03DTO = new MH0205A03DTO();

        // TODO 业务逻辑: A03: 友情链接详细数据获取（根据ID获取友情链接详细数据）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0205A03DTO);
        return jsonResult;
    }

    /**
     * A04: 友情链接编辑提交（友情链接编辑提交）
     */
    @ApiOperation(value = "友情链接编辑提交", notes = "友情链接编辑提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0205A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0205A04InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A04: 友情链接编辑提交（友情链接编辑提交）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A05: 友情链接删除（根据ID删除友情链接）
     */
    @ApiOperation(value = "友情链接删除", notes = "根据ID删除友情链接", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    @ApiImplicitParam(dataType = "MH0205A05InputDTO", name = "input", value = "请求参数")
    public JSONResult A05(@Valid MH0205A05InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A05: 友情链接删除（根据ID删除友情链接）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }
}
