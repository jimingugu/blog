package com.codepresso.codepressoblog.vo;

import java.util.Date;

public class Post {
	//멤버변수 5개 필요
	Integer id;
	String title;
	String content;
	String username;
	Date createdAt;
	
	//생성자와 getter setter 필요!
	public Post(Integer id, String title, String content, String username, Date createdAt) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.username = username;
		this.createdAt = createdAt;
	}// 생성자 단축키 - alt+shift+s,o
	
	public Post(Integer id, String title, String content, String username) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.username = username;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	//getter setter 단축키 - alt+shift+s >> R >> alt+a >> alt+s >> enter
	
	
}
