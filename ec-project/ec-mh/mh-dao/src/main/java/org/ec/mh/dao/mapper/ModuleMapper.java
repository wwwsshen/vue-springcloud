package org.ec.mh.dao.mapper;


import org.ec.mh.entity.Module;

public interface ModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbggenerated
     */
    int insert(Module record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbggenerated
     */
    int insertSelective(Module record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbggenerated
     */
    Module selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Module record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Module record);
}