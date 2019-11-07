package com.zl.mybatis.study.mapper;

import com.zl.mybatis.study.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {

//    @Select("SELECT * FROM blog WHERE id = #{id}")
    Blog selectBlog(int id);


}
