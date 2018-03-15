package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0105Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0105.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;

/**
 * MH0105: 门户网站 - 门户前台（中心信箱）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0105: 门户网站 - 门户前台（中心信箱）")
@RequestMapping("/MH0105")
public class MH0105Controller extends APIController {

    /**
     * MH0105Service
     */
    private final MH0105Service mh0105Service;

    @Autowired
    public MH0105Controller(MH0105Service mh0105Service) {
        this.mh0105Service = mh0105Service;
    }

    /**
     * A01: 公开信件列表获取（分页&查询）（获取公开信件列表（包含分页和按关键字查询)）
     */
    @ApiOperation(value = "公开信件列表获取（分页&查询）", notes = "获取公开信件列表（包含分页和按关键字查询)", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    @ApiImplicitParam(dataType = "MH0105A01InputDTO", name = "input", value = "请求参数")
    public JSONResult A01(@Valid MH0105A01InputDTO input) {
        JSONResult<List<MH0105A01DTO>> jsonResult = new JSONResult<>();
        List<MH0105A01DTO> mh0105A01DTOList = new ArrayList<>();

        // TODO 业务逻辑: A01: 公开信件列表获取（分页&查询）（获取公开信件列表（包含分页和按关键字查询)）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0105A01DTOList);
        return jsonResult;
    }

    /**
     * A02: 信件办理结果查询（根据查询编号和手机号码查询信件办理结果）
     */
    @ApiOperation(value = "信件办理结果查询", notes = "根据查询编号和手机号码查询信件办理结果", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    @ApiImplicitParam(dataType = "MH0105A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0105A02InputDTO input) {
        JSONResult<MH0105A02DTO> jsonResult = new JSONResult<>();
        MH0105A02DTO mh0105A02DTO = new MH0105A02DTO();

        // TODO 业务逻辑: A02: 信件办理结果查询（根据查询编号和手机号码查询信件办理结果）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0105A02DTO);
        return jsonResult;
    }

    /**
     * A03: 信件提交单位数据获取（下拉菜单用）（信件提交单位数据获取（下拉菜单用））
     */
    @ApiOperation(value = "信件提交单位数据获取（下拉菜单用）", notes = "信件提交单位数据获取（下拉菜单用）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    public JSONResult A03() {
        JSONResult<List<MH0105A03DTO>> jsonResult = new JSONResult<>();
        List<MH0105A03DTO> mh0105A03DTOList = new ArrayList<>();

        // TODO 业务逻辑: A03: 信件提交单位数据获取（下拉菜单用）（信件提交单位数据获取（下拉菜单用））
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0105A03DTOList);
        return jsonResult;
    }

    /**
     * A04: 信件登记提交（提交信件登记数据，返回信件查询编号）
     */
    @ApiOperation(value = "信件登记提交", notes = "提交信件登记数据，返回信件查询编号", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0105A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0105A04InputDTO input) {
        JSONResult<MH0105A04DTO> jsonResult = new JSONResult<>();
        MH0105A04DTO mh0105A04DTO = new MH0105A04DTO();

        // TODO 业务逻辑: A04: 信件登记提交（提交信件登记数据，返回信件查询编号）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0105A04DTO);
        return jsonResult;
    }

    /**
     * A05: 信件详情（根据ID查询信件详情）
     */
    @ApiOperation(value = "信件详情", notes = "根据ID查询信件详情", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A05")
    @ApiImplicitParam(dataType = "MH0105A05InputDTO", name = "input", value = "请求参数")
    public JSONResult A05(@Valid MH0105A05InputDTO input) {
        JSONResult<MH0105A05DTO> jsonResult = new JSONResult<>();
        MH0105A05DTO mh0105A05DTO = new MH0105A05DTO();

        // TODO 业务逻辑: A05: 信件详情（根据ID查询信件详情）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0105A05DTO);
        return jsonResult;
    }
}
