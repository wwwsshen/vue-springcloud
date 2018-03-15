package org.ec.mh.entity;

public class AppModule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.module_code
     *
     * @mbggenerated
     */
    private String moduleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.has_child
     *
     * @mbggenerated
     */
    private Byte hasChild;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.level0
     *
     * @mbggenerated
     */
    private Integer level0;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.app_module_name
     *
     * @mbggenerated
     */
    private String appModuleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.parent_code
     *
     * @mbggenerated
     */
    private String parentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.show_order
     *
     * @mbggenerated
     */
    private Integer showOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_module.serial_number
     *
     * @mbggenerated
     */
    private Integer serialNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.id
     *
     * @return the value of app_module.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.id
     *
     * @param id the value for app_module.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.module_code
     *
     * @return the value of app_module.module_code
     *
     * @mbggenerated
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.module_code
     *
     * @param moduleCode the value for app_module.module_code
     *
     * @mbggenerated
     */
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.has_child
     *
     * @return the value of app_module.has_child
     *
     * @mbggenerated
     */
    public Byte getHasChild() {
        return hasChild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.has_child
     *
     * @param hasChild the value for app_module.has_child
     *
     * @mbggenerated
     */
    public void setHasChild(Byte hasChild) {
        this.hasChild = hasChild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.level0
     *
     * @return the value of app_module.level0
     *
     * @mbggenerated
     */
    public Integer getLevel0() {
        return level0;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.level0
     *
     * @param level0 the value for app_module.level0
     *
     * @mbggenerated
     */
    public void setLevel0(Integer level0) {
        this.level0 = level0;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.app_module_name
     *
     * @return the value of app_module.app_module_name
     *
     * @mbggenerated
     */
    public String getAppModuleName() {
        return appModuleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.app_module_name
     *
     * @param appModuleName the value for app_module.app_module_name
     *
     * @mbggenerated
     */
    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName == null ? null : appModuleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.parent_code
     *
     * @return the value of app_module.parent_code
     *
     * @mbggenerated
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.parent_code
     *
     * @param parentCode the value for app_module.parent_code
     *
     * @mbggenerated
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.show_order
     *
     * @return the value of app_module.show_order
     *
     * @mbggenerated
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.show_order
     *
     * @param showOrder the value for app_module.show_order
     *
     * @mbggenerated
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_module.serial_number
     *
     * @return the value of app_module.serial_number
     *
     * @mbggenerated
     */
    public Integer getSerialNumber() {
        return serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_module.serial_number
     *
     * @param serialNumber the value for app_module.serial_number
     *
     * @mbggenerated
     */
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
}