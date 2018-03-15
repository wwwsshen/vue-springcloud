package org.ec.mh.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.ec.mh.entity.AppModule;
import org.ec.utils.GroupForAdd;
import org.ec.utils.GroupForUpdate;
import org.ec.utils.StringUtil;
import org.hibernate.validator.constraints.NotEmpty;


public class AppModuleDTO {
	
	@NotEmpty(message= "{general.NotEmpty}", groups = GroupForUpdate.class)
	private String id;
	@NotEmpty(message= "{general.NotEmpty}", groups = {GroupForAdd.class, GroupForUpdate.class})
	private String moduleName;
	@Min(0)
	@Max(20)
	private Integer serialNumber;
	
	private Byte hasChild;
	
	private Integer level0;
	
	private String moduleCode;
	
	private String parentCode;
	
	private Integer showOrder;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = StringUtil.isNullOrEmpty(moduleName) ? null : moduleName;
	}
	
	public Integer getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public Byte getHasChild() {
		return hasChild;
	}

	public void setHasChild(Byte hasChild) {
		this.hasChild = hasChild;
	}

	public Integer getLevel0() {
		return level0;
	}

	public void setLevel0(Integer level0) {
		this.level0 = level0;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public Integer getShowOrder() {
		return showOrder;
	}

	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}

	/**
	 * 转换为实体
	 */
	public AppModule toAppModule() {
		AppModule am = new AppModule();
		
		am.setId(id);
		am.setAppModuleName(moduleName);
		am.setHasChild(hasChild);
		am.setLevel0(level0);
		am.setModuleCode(moduleCode);
		am.setParentCode(parentCode);
		am.setSerialNumber(serialNumber);
		am.setShowOrder(showOrder);
		
		return am;
	}
}
