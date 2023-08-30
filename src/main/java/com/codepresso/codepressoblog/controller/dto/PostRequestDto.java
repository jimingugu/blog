package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;

import lombok.Setter;

//PostRequestDto로부터 GetPost객체를 만드는 것
@Setter
public class PostRequestDto {
	Integer id;
	String title;
	String content;
	String username;
	
	public Post getPost() {
		return new Post(this.id, this.title, this.content, this.username);
	}
}
