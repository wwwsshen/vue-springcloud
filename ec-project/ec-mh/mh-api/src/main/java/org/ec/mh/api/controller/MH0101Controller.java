package org.ec.mh.api.controller;

import io.swagger.annotations.*;
import org.ec.mh.service.MH0101Service;
import org.ec.mh.service.impl.MH0101ServiceImpl;
import org.ec.mh.service.impl.MHServiceImplConfiguration;
import org.ec.utils.EcUtilsConfiguration;
import org.ec.utils.JSONResult;
import org.ec.mh.dto.MH0101.*;
import org.ec.utils.controller.APIController;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.ArrayList;

/**
 * MH0101: 门户网站 - 门户前台（首页）
 * 作者：
 * 日期：
 */

@RestController
@CrossOrigin
@Api("MH0101: 门户网站 - 门户前台（首页）")
@RequestMapping("/MH0101")
public class MH0101Controller extends APIController {

    /**
     * MH0101Service
     */
    private final MH0101Service mh0101Service;

    @Autowired
    public MH0101Controller(MH0101Service mh0101Service) {
        this.mh0101Service = mh0101Service;
    }

    /**
     * A01: 导航栏数据获取（获取导航栏的数据，可包含二级目录）
     */
    @ApiOperation(value = "导航栏数据获取", notes = "获取导航栏的数据，可包含二级目录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01() {
        JSONResult<List<MH0101A01DTO>> jsonResult = new JSONResult<>();
        List<MH0101A01DTO> mh0101A01DTOList = new ArrayList<>();

        // TODO 业务逻辑: A01: 导航栏数据获取（获取导航栏的数据，可包含二级目录）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0101A01DTOList);
        return jsonResult;
    }

    /**
     * A02: 轮播图数据获取（获取轮播图数据）
     */
    @ApiOperation(value = "轮播图数据获取", notes = "获取轮播图数据", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    public JSONResult A02() {
        JSONResult<List<MH0101A02DTO>> jsonResult = new JSONResult<>();
        List<MH0101A02DTO> mh0101A02DTOList = new ArrayList<>();

        // TODO 业务逻辑: A02: 轮播图数据获取（获取轮播图数据）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0101A02DTOList);
        return jsonResult;
    }

    /**
     * A03: 办事服务入口数据获取（获取办事服务入口链接）
     */
    @ApiOperation(value = "办事服务入口数据获取", notes = "获取办事服务入口链接", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    public JSONResult A03() {
        JSONResult<List<MH0101A03DTO>> jsonResult = new JSONResult<>();
        List<MH0101A03DTO> mh0101A03DTOList = new ArrayList<>();

        // TODO 业务逻辑: A03: 办事服务入口数据获取（获取办事服务入口链接）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0101A03DTOList);
        return jsonResult;
    }

    /**
     * A04: 友情链接数据获取（获取友情链接数据）
     */
    @ApiOperation(value = "友情链接数据获取", notes = "获取友情链接数据", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A04")
    public JSONResult A04() {
        JSONResult<List<MH0101A04DTO>> jsonResult = new JSONResult<>();
        List<MH0101A04DTO> mh0101A04DTOList = new ArrayList<>();

        // TODO 业务逻辑: A04: 友情链接数据获取（获取友情链接数据）
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0101A04DTOList);
        return jsonResult;
    }

    /**
     * A05: 板块文章获取（获取在首页显示的板块及文章数据（10条））
     */
    @ApiOperation(value = "板块文章获取", notes = "获取在首页显示的板块及文章数据（10条）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A05")
    public JSONResult A05() {
        JSONResult<List<MH0101A05DTO>> jsonResult = new JSONResult<>();
        List<MH0101A05DTO> mh0101A05DTOList = new ArrayList<>();

        // TODO 业务逻辑: A05: 板块文章获取（获取在首页显示的板块及文章数据（10条））
        jsonResult.setMessage("接口未实现"); // 实现后删除本行

        jsonResult.setData(mh0101A05DTOList);
        return jsonResult;
    }
}
