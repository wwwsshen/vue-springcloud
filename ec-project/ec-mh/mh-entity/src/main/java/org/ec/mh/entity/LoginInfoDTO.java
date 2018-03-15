package org.ec.mh.entity;


import javax.validation.constraints.Size;

import org.ec.utils.StringUtil;
import org.ec.utils.SystemConstants;
import org.ec.utils.ThreadParamUtil;
import org.hibernate.validator.constraints.NotEmpty;




/**
 * @author zx
 * 
 * 用于存储用户登录以后，前端传过来的信息
 * */
public class LoginInfoDTO {
	/**
	 * 当前用户的角色类型，该字段在登录以后的操作中不能为空
	 * */
	@NotEmpty(message="{general.NotEmpty}")
	@Size(max=10)
	private String curRoleType;
	
	/**
	 * 通过token值获取的userid，该字段在登录以后的操作中不能为空
	 * */
	@NotEmpty(message="{general.NotEmpty}")
	@Size(max=20)
	private String curUserid;
	
	/**
	 * 当前用户登录的组织结构Code，对应的是code值不是id，该字段在登录以后的操作中不能为空
	 * */
	@NotEmpty(message="{general.NotEmpty}")
	@Size(max=255)
	private String curOrgId;
	
	/**
	 * 当前用户登录的组织结构code，该字段在登录以后的操作中不能为空
	 * */
/*
	@NotEmpty(message="{general.NotEmpty}")
	@Size(max=255)
	private String curOrgCode;
	*/
	
	public LoginInfoDTO() {
		// 在初始化该Dto时进行userid的取值
		Object oCurUserid = ThreadParamUtil.get(SystemConstants.CUR_USER_ID_KEY);
		Object oCurRoleType = ThreadParamUtil.get(SystemConstants.CUR_ROLE_TYPE_KEY);
		Object oCurOrgId = ThreadParamUtil.get(SystemConstants.CUR_ORG_ID_KEY);
		//Object oCurOrgCode = ThreadParamUtil.get(SystemConstants.CUR_ORG_CODE_KEY);
		
		if(oCurUserid != null && oCurRoleType != null && oCurOrgId != null /*&& oCurOrgCode != null*/) {
			String curUserid = oCurUserid.toString();
			String curRoleType = oCurRoleType.toString();
			String curOrgId = oCurOrgId.toString();
		//	String curOrgCode = oCurOrgCode.toString();
			
			if(!StringUtil.isNullOrEmptyForMultiStr(curUserid, curRoleType, curOrgId/*, curOrgCode*/)) {

				setCurUserid(curUserid);
				setCurRoleType(curRoleType);
				setCurOrgId(curOrgId);
			//	setCurOrgCode(curOrgCode);
			}
		}
		
	}
	
	public String getCurRoleType() {
		return curRoleType;
	}

	public void setCurRoleType(String curRoleType) {
		this.curRoleType = curRoleType;
	}

	public String getCurUserid() {
		return curUserid;
	}

	public void setCurUserid(String curUserid) {
		this.curUserid = curUserid;
	}

	public String getCurOrgId() {
		return curOrgId;
	}

	public void setCurOrgId(String curOrgId) {
		this.curOrgId = curOrgId;
	}
}
