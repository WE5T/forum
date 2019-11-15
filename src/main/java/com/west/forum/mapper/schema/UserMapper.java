package com.west.forum.mapper.schema;

import com.west.forum.model.schema.User;
import com.west.forum.model.schema.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.USERTABLE
     *
     * @mbg.generated Fri Nov 15 22:28:56 CST 2019
     */
    int updateByPrimaryKey(User record);
}