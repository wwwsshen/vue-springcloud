package org.ec.mh.dto;

import org.ec.mh.entity.Module;
import org.ec.utils.GroupForAdd;
import org.ec.utils.GroupForUpdate;
import org.hibernate.validator.constraints.NotEmpty;



public class ModuleDTO {
	//模块ID
	@NotEmpty(message="{general.NotEmpty}",groups = GroupForUpdate.class)
	private String moduleId;

	//模块名字
	@NotEmpty(message="{general.NotEmpty}",groups = {GroupForUpdate.class,GroupForAdd.class})
	private String moduleName;
	
	//模块路径
	@NotEmpty(message="{general.NotEmpty}",groups = {GroupForUpdate.class,GroupForAdd.class})
	private String url;
	
	//模块拥有者类型
	@NotEmpty(message="{general.NotEmpty}",groups = {GroupForUpdate.class,GroupForAdd.class})
	private String ownerType;

	//模块id数组
	private String[] moduleIds;
	
	//父节点
	private String parentCode;
	
	
	//序号
	private int showOrder;
	
	//层级
	private int level0;
	
	private String childShowType;
	
	private byte isRead;
	
	private String  moduleCode;
	
	public String getChildShowType() {
		return childShowType;
	}

	public void setChildShowType(String childShowType) {
		this.childShowType = childShowType;
	}

	public int getLevel0() {
		return level0;
	}

	public void setLevel0(int level0) {
		this.level0 = level0;
	}

	public int getShowOrder() {
		return showOrder;
	}

	public void setShowOrder(int showOrder) {
		this.showOrder = showOrder;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String[] getModuleIds() {
		return moduleIds;
	}

	public void setModuleIds(String[] moduleIds) {
		this.moduleIds = moduleIds;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public byte getIsRead() {
		return isRead;
	}

	public void setIsRead(byte isRead) {
		this.isRead = isRead;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public Module toModule() {
		Module module = new Module();
		
		module.setId(moduleId);
		module.setModuleName(moduleName);
		module.setUrl(url);
		module.setOwnerType(ownerType);
		module.setParentCode(parentCode);
		module.setShowOrder(showOrder);
		module.setLevel0(level0);
		module.setChildShowType(childShowType);
		module.setIsRead(isRead);
		
		return module;
	}
	
}
