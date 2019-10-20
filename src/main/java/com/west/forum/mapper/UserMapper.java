package com.west.forum.mapper;

import com.west.forum.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

   @Insert("insert into h2db.schema.userTable (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
   void insert(User user);

   @Select("select * from h2db.schema.userTable where token = #{token}")
    User findByToken(@Param("token") String token);

   @Select("select * from h2db.schema.userTable where id = #{id}")
    User findById(@Param("id") Integer creator);

    @Select("select * from h2db.schema.userTable where account_id = #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("update h2db.schema.userTable set name = #{name}, token = #{token}, gmt_modified = #{gmtModified}, avatar_url = #{avatarUrl} where id = #{id}")
    void update(User user);
}
