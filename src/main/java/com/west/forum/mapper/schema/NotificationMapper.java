package com.west.forum.mapper.schema;

import com.west.forum.model.schema.Notification;
import com.west.forum.model.schema.NotificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NotificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    long countByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int deleteByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int insert(Notification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int insertSelective(Notification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    List<Notification> selectByExampleWithRowbounds(NotificationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    List<Notification> selectByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    Notification selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") Notification record, @Param("example") NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int updateByExample(@Param("record") Notification record, @Param("example") NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int updateByPrimaryKeySelective(Notification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMA.NOTIFICATION
     *
     * @mbg.generated Thu Nov 21 13:49:03 CST 2019
     */
    int updateByPrimaryKey(Notification record);
}