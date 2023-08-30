package com.codepresso.codepressoblog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codepresso.codepressoblog.mapper.PostMapper;
import com.codepresso.codepressoblog.vo.Post;

@Service
public class PostService {
	
	//의존성 주입
	private PostMapper postMapper;
	public PostService(PostMapper postMapper) {
		this.postMapper = postMapper;
	}
	
	//findAll 호출
	public List<Post> getAllPost(){
		return postMapper.findAll();
	}
	
	//findByPage 호출
	//offset을 계산해서 파라미터로 보내주고 있음
	public List<Post> getPostByPage(Integer page, Integer size){
		return postMapper.findByPage(size, (page-1)*size);
	}
	
	public Post getPostById(Integer id) {
		return postMapper.findOne(id);
	}
	
	public boolean savePost(Post post) {
		Integer result = postMapper.save(post);
		return result == 1;
	}
}
