package org.ec.mh.dto;

import javax.validation.constraints.Size;

import org.ec.mh.entity.Role;
import org.ec.utils.GroupForAdd;
import org.ec.utils.GroupForUpdate;
import org.ec.utils.SystemConstants;
import org.hibernate.validator.constraints.NotEmpty;




/**
 * @author zx
 * */
public class RoleAndPermDTO {
	// 角色id
	@NotEmpty(message= "{general.NotEmpty}", groups = GroupForUpdate.class)
	@Size(max=20)
	private String roleId;
	
	// 角色名字
	@NotEmpty(message= "{general.NotEmpty}", groups = { GroupForUpdate.class, GroupForAdd.class })
	@Size(max=20)
	private String roleName;
	
	// 角色备注
	@Size(max=1000)
	private String roleRemark;
	
	// 模块id数组
	private String[] moduleIds;
	
	// 模块编码数组
	private String[] moduleCodes;
	
	//app模块
	private String[] appModuleCodes;
	
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleRemark() {
		return roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

	public String[] getModuleIds() {
		return moduleIds;
	}

	public void setModuleIds(String[] moduleIds) {
		this.moduleIds = moduleIds;
	}
	
	public String[] getModuleCodes() {
		return moduleCodes;
	}

	public void setModuleCodes(String[] moduleCodes) {
		this.moduleCodes = moduleCodes;
	}

	public String[] getAppModuleCodes() {
		return appModuleCodes;
	}

	public void setAppModuleCodes(String[] appModuleCodes) {
		this.appModuleCodes = appModuleCodes;
	}

	public Role toRole() {
		Role role = new Role();
		
		role.setId(roleId);
		role.setName(roleName);
		role.setRemark(roleRemark);
		if(type==1){
			role.setType(SystemConstants.BASE_ROLE_TYPE);
		}else{
			role.setType(SystemConstants.EXTRA_ROLE_TYPE);
		}
		
		return role;
	}
}















