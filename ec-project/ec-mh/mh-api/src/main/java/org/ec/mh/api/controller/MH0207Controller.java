package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0207Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0207.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * MH0207: 门户网站 - 门户后台（中心信箱）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0207: 门户网站 - 门户后台（中心信箱）")
@RequestMapping("/MH0207")
public class MH0207Controller extends APIController {

    /**
     * MH0207Service
     */
    private final MH0207Service mh0207Service;

    @Autowired
    public MH0207Controller(MH0207Service mh0207Service) {
        this.mh0207Service = mh0207Service;
    }

    /**
     * A01: 信件列表获取（分页&查询）（获取信件列表，包含分页和查询）
     */
    @ApiOperation(value = "信件列表获取（分页&查询）", notes = "获取信件列表，包含分页和查询", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    @ApiImplicitParam(dataType = "MH0207A01InputDTO", name = "input", value = "请求参数")
    public JSONResult A01(@Valid MH0207A01InputDTO input) {
        JSONResult<MH0207A01DTO> jsonResult = new JSONResult<>();
        MH0207A01DTO mh0207A01DTO = new MH0207A01DTO();

        // TODO 业务逻辑: A01: 信件列表获取（分页&查询）（获取信件列表，包含分页和查询）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0207A01DTO);
        return jsonResult;
    }

    /**
     * A02: 信件详细信息获取（获取信件详细信息）
     */
    @ApiOperation(value = "信件详细信息获取", notes = "获取信件详细信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    @ApiImplicitParam(dataType = "MH0207A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0207A02InputDTO input) {
        JSONResult<MH0207A02DTO> jsonResult = new JSONResult<>();
        MH0207A02DTO mh0207A02DTO = new MH0207A02DTO();

        // TODO 业务逻辑: A02: 信件详细信息获取（获取信件详细信息）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0207A02DTO);
        return jsonResult;
    }

    /**
     * A03: 转发其他单位（将信件转发其他单位）
     */
    @ApiOperation(value = "转发其他单位", notes = "将信件转发其他单位", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    @ApiImplicitParam(dataType = "MH0207A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0207A03InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A03: 转发其他单位（将信件转发其他单位）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A04: 信件办理结果提交（提交信件办理结果）
     */
    @ApiOperation(value = "信件办理结果提交", notes = "提交信件办理结果", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0207A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0207A04InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A04: 信件办理结果提交（提交信件办理结果）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }

    /**
     * A05: 修改信件状态（修改信件状态，回退到未办理，以便再次编辑）
     */
    @ApiOperation(value = "修改信件状态", notes = "修改信件状态，回退到未办理，以便再次编辑", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    @ApiImplicitParam(dataType = "MH0207A05InputDTO", name = "input", value = "请求参数")
    public JSONResult A05(@Valid MH0207A05InputDTO input) {
        JSONResult jsonResult = new JSONResult();

        // TODO 业务逻辑: A05: 修改信件状态（修改信件状态，回退到未办理，以便再次编辑）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        return jsonResult;
    }
}
