package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0203Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0203.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;

/**
 * MH0203: 门户网站 - 门户后台（轮播图管理）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0203: 门户网站 - 门户后台（轮播图管理）")
@RequestMapping("/MH0203")
public class MH0203Controller extends APIController {

    /**
     * MH0203Service
     */
    private final MH0203Service mh0203Service;

    @Autowired
    public MH0203Controller(MH0203Service mh0203Service) {
        this.mh0203Service = mh0203Service;
    }

    /**
     * A01: 轮播图列表数据获取（轮播图列表数据获取）
     */
    @ApiOperation(value = "轮播图列表数据获取", notes = "轮播图列表数据获取", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01() {
        JSONResult<List<MH0203A01DTO>> jsonResult = new JSONResult<>();
        List<MH0203A01DTO> mh0203A01DTOList = new ArrayList<>();

        // TODO 业务逻辑: A01: 轮播图列表数据获取（轮播图列表数据获取）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0203A01DTOList);
        return jsonResult;
    }

    /**
     * A02: 轮播图设置新增（新增轮播图数据，返回ID）
     */
    @ApiOperation(value = "轮播图设置新增", notes = "新增轮播图数据，返回ID", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02() {
        JSONResult<MH0203A02DTO> jsonResult = new JSONResult<>();
        MH0203A02DTO mh0203A02DTO = new MH0203A02DTO();

        // TODO 业务逻辑: A02: 轮播图设置新增（新增轮播图数据，返回ID）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0203A02DTO);
        return jsonResult;
    }

    /**
     * A03: 轮播图设置更新（轮播图设置更新）
     */
    @ApiOperation(value = "轮播图设置更新", notes = "轮播图设置更新", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    @ApiImplicitParam(dataType = "MH0203A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0203A03InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A03: 轮播图设置更新（轮播图设置更新）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A04: 轮播图删除（根据ID删除轮播图）
     */
    @ApiOperation(value = "轮播图删除", notes = "根据ID删除轮播图", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0203A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0203A04InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A04: 轮播图删除（根据ID删除轮播图）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }
}
