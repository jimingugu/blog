package com.codepresso.codepressoblog.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codepresso.codepressoblog.service.PostService;
import com.codepresso.codepressoblog.vo.Post;

@Controller
public class IndexController {
	
	//PostService 의존성 주입 (postService를 사용할 수 있도록)
	private PostService postService;
	public IndexController(PostService postService) {
		this.postService = postService;
	}
	
	
    @RequestMapping(value = "/")
    public String index(Model model) {
    	List<Post> postList = postService.getPostByPage(1, 3);	//처음 3개 조회
    	model.addAttribute("posts", postList);
    	return "index";
    }
}
