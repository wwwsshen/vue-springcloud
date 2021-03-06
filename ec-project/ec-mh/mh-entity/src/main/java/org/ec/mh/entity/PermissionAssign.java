package org.ec.mh.entity;

public class PermissionAssign {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_assign.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_assign.owner_type
     *
     * @mbggenerated
     */
    private String ownerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_assign.owner_type_code
     *
     * @mbggenerated
     */
    private String ownerTypeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_assign.module_code
     *
     * @mbggenerated
     */
    private String moduleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_assign.is_no
     *
     * @mbggenerated
     */
    private Byte isNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_assign.id
     *
     * @return the value of permission_assign.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_assign.id
     *
     * @param id the value for permission_assign.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_assign.owner_type
     *
     * @return the value of permission_assign.owner_type
     *
     * @mbggenerated
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_assign.owner_type
     *
     * @param ownerType the value for permission_assign.owner_type
     *
     * @mbggenerated
     */
    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_assign.owner_type_code
     *
     * @return the value of permission_assign.owner_type_code
     *
     * @mbggenerated
     */
    public String getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_assign.owner_type_code
     *
     * @param ownerTypeCode the value for permission_assign.owner_type_code
     *
     * @mbggenerated
     */
    public void setOwnerTypeCode(String ownerTypeCode) {
        this.ownerTypeCode = ownerTypeCode == null ? null : ownerTypeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_assign.module_code
     *
     * @return the value of permission_assign.module_code
     *
     * @mbggenerated
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_assign.module_code
     *
     * @param moduleCode the value for permission_assign.module_code
     *
     * @mbggenerated
     */
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_assign.is_no
     *
     * @return the value of permission_assign.is_no
     *
     * @mbggenerated
     */
    public Byte getIsNo() {
        return isNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_assign.is_no
     *
     * @param isNo the value for permission_assign.is_no
     *
     * @mbggenerated
     */
    public void setIsNo(Byte isNo) {
        this.isNo = isNo;
    }
}