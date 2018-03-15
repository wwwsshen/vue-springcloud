package org.ec.mh.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.ec.mh.dto.MH0202.*;
import org.ec.mh.entity.MHArticleType;
import org.ec.mh.service.MH0202Service;
import org.ec.utils.BeanMapper;
import org.ec.utils.JSONResult;
import org.ec.utils.controller.APIController;
import org.ec.utils.exception.BusinessException;
import org.ec.utils.exception.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * MH0202: 门户网站 - 门户后台（文章分类）
 * 作者：
 * 日期：
 */
@RestController
@CrossOrigin
@Api("MH0202: 门户网站 - 门户后台（文章分类）")
@RequestMapping("/MH0202")
public class MH0202Controller extends APIController {

    /**
     * MH0202Service
     */
    private final MH0202Service mh0202Service;

    @Autowired
    public MH0202Controller(MH0202Service mh0202Service) {
        this.mh0202Service = mh0202Service;
    }

    /**
     * A01: 文章分类列表获取（获取文章分类列表）
     */
    @ApiOperation(value = "文章分类列表获取", notes = "获取文章分类列表", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01() {
        JSONResult<List<MH0202A01DTO>> jsonResult = new JSONResult<>();

        // 查询列表
        List<MHArticleType> mhArticleTypeList = mh0202Service.findAllMHArticleTypes();

        // 转换数据
        List<MH0202A01DTO> mh0202A01DTOList = BeanMapper.mapList(mhArticleTypeList, MH0202A01DTO.class);

        jsonResult.setData(mh0202A01DTOList);
        return jsonResult;
    }

    /**
     * A02: 文章分类新增提交（文章分类新增提交）
     */
    @ApiOperation(value = "文章分类新增提交", notes = "文章分类新增提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    @ApiImplicitParam(dataType = "MH0202A02InputDTO", name = "input", value = "请求参数")
    public JSONResult A02(@Valid MH0202A02InputDTO input) throws BusinessException {
        JSONResult jsonResult = new JSONResult();
        MHArticleType mhArticleType = BeanMapper.map(input, MHArticleType.class);

        boolean success = mh0202Service.addMHArticleType(mhArticleType);
        if (!success) {
            throw new BusinessException(new Message("CM.DB.CREATE_FAILED", "文章分类"));
        }
        return jsonResult;
    }

    /**
     * A03: 文章分类详细数据获取（文章分类详细数据获取）
     */
    @ApiOperation(value = "文章分类详细数据获取", notes = "文章分类详细数据获取", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    @ApiImplicitParam(dataType = "MH0202A03InputDTO", name = "input", value = "请求参数")
    public JSONResult A03(@Valid MH0202A03InputDTO input) throws BusinessException {
        JSONResult<MH0202A03DTO> jsonResult = new JSONResult<>();

        // 根据ID查询文章分类详细数据
        MHArticleType mhArticleType = mh0202Service.getMHArticleType(input.getId());
        if (mhArticleType == null) {
            throw new BusinessException(new Message("CM.DB.NO_RESULT", "文章分类"));
        }

        MH0202A03DTO mh0202A03DTO = BeanMapper.map(mhArticleType, MH0202A03DTO.class);

        jsonResult.setData(mh0202A03DTO);
        return jsonResult;
    }

    /**
     * A04: 文章分类编辑提交（文章分类编辑提交）
     */
    @ApiOperation(value = "文章分类编辑提交", notes = "文章分类编辑提交", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    @ApiImplicitParam(dataType = "MH0202A04InputDTO", name = "input", value = "请求参数")
    public JSONResult A04(@Valid MH0202A04InputDTO input) throws BusinessException {
        JSONResult jsonResult = new JSONResult();
        MHArticleType mhArticleType = BeanMapper.map(input, MHArticleType.class);

        boolean success = mh0202Service.editMHArticleType(mhArticleType);
        if (!success) {
            throw new BusinessException(new Message("CM.DB.UPDATE_FAILED", "文章分类"));
        }

        return jsonResult;
    }

    /**
     * A05: 文章分类删除（文章分类删除）
     */
    @ApiOperation(value = "文章分类删除", notes = "文章分类删除", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    @ApiImplicitParam(dataType = "MH0202A05InputDTO", name = "input", value = "请求参数")
    public JSONResult A05(@Valid MH0202A05InputDTO input) throws BusinessException {
        JSONResult jsonResult = new JSONResult();

        boolean success = mh0202Service.deleteMHArticleType(input.getId());
        if (!success) {
            throw new BusinessException(new Message("CM.DB.DELETE_FAILED", "文章分类"));

        }

        return jsonResult;
    }
}
