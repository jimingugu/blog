package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;

import lombok.Getter;

//생성자를 이용해서 데이터를 초기화 시킴. 그래서 생성자는 인자로 Post를 받아야 함. (Post객체로부터 PostResponseDto를 만드는 것)
@Getter
public class PostResponseDto {
	Integer id;
	String title;
	String content;
	String username;
	
	public PostResponseDto(Post post) {
		this.id = post.getId();
		this.title = post.getTitle();
		this.content = post.getContent();
		this.username = post.getUsername();
	}
}
