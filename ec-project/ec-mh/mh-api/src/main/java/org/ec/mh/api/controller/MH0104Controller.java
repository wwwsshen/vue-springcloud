package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0104Service;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0104.*;
import org.ec.utils.controller.APIController;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * MH0104: 门户网站 - 门户前台（搜索页）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0104: 门户网站 - 门户前台（搜索页）")
@RequestMapping("/MH0104")
public class MH0104Controller extends APIController {

    /**
     * MH0104Service
     */
    private final MH0104Service mh0104Service;

    @Autowired
    public MH0104Controller(MH0104Service mh0104Service) {
        this.mh0104Service = mh0104Service;
    }

    /**
     * A01: 站内搜索（分页）（根据关键字查询所有文章内容，获取查询结果（20条分页））
     */
    @ApiOperation(value = "站内搜索（分页）", notes = "根据关键字查询所有文章内容，获取查询结果（20条分页）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    @ApiImplicitParam(dataType = "MH0104A01InputDTO", name = "input", value = "请求参数")
    public JSONResult A01(@Valid MH0104A01InputDTO input) {
        JSONResult<MH0104A01DTO> jsonResult = new JSONResult<>();
        MH0104A01DTO mh0104A01DTO = new MH0104A01DTO();

        // TODO 业务逻辑: A01: 站内搜索（分页）（根据关键字查询所有文章内容，获取查询结果（20条分页））
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0104A01DTO);
        return jsonResult;
    }
}
