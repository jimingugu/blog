package com.codepresso.codepressoblog.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.codepresso.codepressoblog.vo.Post;

@Mapper
public interface PostMapper {
	//Post 객체체의 List를 return하는 findAll 메서드 만들어주기.
	List<Post> findAll();
	List<Post> findByPage(@Param("limit") Integer limint, @Param("offset") Integer offset); //파라미터로 limit과 offset을 받음.
	Post findOne(@Param("id") Integer id);
	Integer save(@Param("post") Post post);
}
