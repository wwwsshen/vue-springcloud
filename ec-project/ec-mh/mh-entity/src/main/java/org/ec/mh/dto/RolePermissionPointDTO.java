package org.ec.mh.dto;

import javax.validation.constraints.Size;

import org.ec.utils.GroupForAdd;
import org.ec.utils.GroupForUpdate;
import org.hibernate.validator.constraints.NotEmpty;



public class RolePermissionPointDTO {
	//id
	@NotEmpty(message = "{general.NotEmpty}", groups = {GroupForUpdate.class})
	@Size(max = 50)
	private String id;
	
	//assignId
	@NotEmpty(message = "{general.NotEmpty}", groups = {GroupForUpdate.class})
	@Size(max = 50)
	private String assignId;
	
	//assignId
	@NotEmpty(message = "{general.NotEmpty}", groups = {GroupForAdd.class,GroupForUpdate.class})
	@Size(max = 50)
	private String pointId;
	
	//moduleCode
	@NotEmpty(message = "{general.NotEmpty}", groups = { GroupForAdd.class,
			GroupForUpdate.class })
	@Size(max = 50)
	private String moduleCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssignId() {
		return assignId;
	}

	public void setAssignId(String assignId) {
		this.assignId = assignId;
	}

	public String getPointId() {
		return pointId;
	}

	public void setPointId(String pointId) {
		this.pointId = pointId;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	
	
}
