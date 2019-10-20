package com.west.forum.mapper;

import com.west.forum.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("insert into h2db.schema.question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    public void create(Question question);

    @Select("select * from h2db.schema.question order by id limit #{offset}, #{size}")
    List<Question> list(@Param(value = "offset") int offset,@Param(value = "size")  int size);

    @Select("select count(1) from h2db.schema.question")
    int count();

    @Select("select * from h2db.schema.question where creator = #{userId} order by id limit #{offset}, #{size}")
    List<Question> listByUserId(@Param(value = "userId") Integer userId, @Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    @Select("select count(1) from h2db.schema.question where creator = #{userId}")
    Integer countByUserId(@Param(value = "userId")Integer userId);

    @Select("select * from h2db.schema.question where id = #{id} order by id")
    Question getById(@Param(value = "id") Integer id);
}
