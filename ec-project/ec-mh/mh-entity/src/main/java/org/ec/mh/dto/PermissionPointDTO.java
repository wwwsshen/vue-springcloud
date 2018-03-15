package org.ec.mh.dto;

import org.ec.mh.entity.PermissionPoint;
import org.ec.utils.GroupForAdd;
import org.ec.utils.GroupForUpdate;
import org.ec.utils.StringUtil;
import org.hibernate.validator.constraints.NotEmpty;


public class PermissionPointDTO {
	//权限点ID
	@NotEmpty(message = "{general.NotEmpty}", groups = GroupForUpdate.class)
	private String id;

	// 模块代码
	@NotEmpty(message = "{general.NotEmpty}", groups = { GroupForUpdate.class})
	private String moduleCode;

	// 权限点代码
	@NotEmpty(message = "{general.NotEmpty}", groups = { GroupForUpdate.class,
			GroupForAdd.class })
	private String operationCode;

	//权限点名称
	@NotEmpty(message = "{general.NotEmpty}", groups = { GroupForUpdate.class,
			GroupForAdd.class })
	private String operationName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	
	public PermissionPoint toModel(){
		PermissionPoint mo = new PermissionPoint();
		mo.setId(StringUtil.createTimestamp());
		mo.setModuleCode(moduleCode);
		mo.setOperationCode(operationCode);
		mo.setOperationName(operationName);
		
		return mo;
	}
	
}
