package com.codepresso.codepressoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codepresso.codepressoblog.service.PostService;
import com.codepresso.codepressoblog.vo.Post;

@Controller
public class PostPageController {
	
	//의존성 주입
	private PostService postService;
	public PostPageController(PostService postService) {
		this.postService = postService;
	}
	
	@RequestMapping("/post/{id}")
	public String getPostDetailPage(Model model, @PathVariable Integer id) {
		Post post = postService.getPostById(id);
		model.addAttribute("post", post);
		return "post_detail";
	}
	
	@RequestMapping("/post/create")
	public String getPostCreatePage() {
		return "post_write";
	}
}
