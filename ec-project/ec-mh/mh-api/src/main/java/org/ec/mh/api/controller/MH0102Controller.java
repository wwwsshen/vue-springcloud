package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0102Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0102.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;

/**
 * MH0102: 门户网站 - 门户前台（目录页）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0102: 门户网站 - 门户前台（目录页）")
@RequestMapping("/MH0102")
public class MH0102Controller extends APIController {

    /**
     * MH0102Service
     */
    private final MH0102Service mh0102Service;

    @Autowired
    public MH0102Controller(MH0102Service mh0102Service) {
        this.mh0102Service = mh0102Service;
    }

    /**
     * A01: 目录数据获取（获取分类目录信息，可包含二级目录）
     */
    @ApiOperation(value = "目录数据获取", notes = "获取分类目录信息，可包含二级目录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    @ApiImplicitParam(dataType = "MH0102A01InputDTO", name = "input", value = "请求参数")
    public JSONResult A01(@Valid MH0102A01InputDTO input) {
        JSONResult<List<MH0102A01DTO>> jsonResult = new JSONResult<>();
        List<MH0102A01DTO> mh0102A01DTOList = new ArrayList<>();

        // TODO 业务逻辑: A01: 目录数据获取（获取分类目录信息，可包含二级目录）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0102A01DTOList);
        return jsonResult;
    }

    /**
     * A02: 目录文章获取（分页）（获取该目录下（包含下级目录）20条文章，包含分页）
     */
    @ApiOperation(value = "目录文章获取（分页）", notes = "获取该目录下（包含下级目录）20条文章，包含分页", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    @ApiImplicitParam(dataType = "MH0102A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0102A02InputDTO input) {
        JSONResult<List<MH0102A02DTO>> jsonResult = new JSONResult<>();
        List<MH0102A02DTO> mh0102A02DTOList = new ArrayList<>();

        // TODO 业务逻辑: A02: 目录文章获取（分页）（获取该目录下（包含下级目录）20条文章，包含分页）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0102A02DTOList);
        return jsonResult;
    }

    /**
     * A03: 目录统计数据获取（获取该目录的统计数据（文章条数和访问总数））
     */
    @ApiOperation(value = "目录统计数据获取", notes = "获取该目录的统计数据（文章条数和访问总数）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    @ApiImplicitParam(dataType = "MH0102A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0102A03InputDTO input) {
        JSONResult<MH0102A03DTO> jsonResult = new JSONResult<>();
        MH0102A03DTO mh0102A03DTO = new MH0102A03DTO();

        // TODO 业务逻辑: A03: 目录统计数据获取（获取该目录的统计数据（文章条数和访问总数））
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0102A03DTO);
        return jsonResult;
    }
}
