package com.codepresso.codepressoblog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codepresso.codepressoblog.controller.dto.PostRequestDto;
import com.codepresso.codepressoblog.controller.dto.PostResponseDto;
import com.codepresso.codepressoblog.service.PostService;
import com.codepresso.codepressoblog.vo.Post;

@RestController
public class PostController {
	
	//postService를 사용하기 위해 의존성 주입
	private PostService postService;
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping("/post")
	public List<PostResponseDto> getPostList(@RequestParam Integer page){
		List<Post> postList = postService.getPostByPage(page, 3);				//getPostByPage 호출 (화면으로 부터 넘겨받은 페이지 정보와 고정되어 있는 3(사이즈)를 인자로 넘김)
		List<PostResponseDto> postResponseDtoList = new ArrayList<>();			//최종적으로 응답할 PostResponseDto 객체들이 담겨있는 List 생성.
		for(Post post : postList) {												//postList에 있는 Post들을 하나씩 꺼내서 PostResponseDto를 생성함. (PostResponseDto에 Post를 넘기면 멤버변수를 기반으로 PostResponseDto를 생성할 수 있음)
			postResponseDtoList.add(new PostResponseDto(post));					//PostResponseDto를 생성해서 postResponseDtoList에 하나씩 추가.
		}
		return postResponseDtoList;
	}
	
	public String creatPost(@RequestBody PostRequestDto postDto) {
		Post post = postDto.getPost();
		postService.savePost(post);
		
		return "success";
	}
}
