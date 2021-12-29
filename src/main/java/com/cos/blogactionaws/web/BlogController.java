package com.cos.blogactionaws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

	@GetMapping("/")
	public String home() {
		return "<h1>README 최종 수정 - 정리끝</h1> 자세히 : <a>https://github.com/codingspecialist/github-action-stalk-no-nginx/blob/master/README.md</a>";
	}
}
