package com.app.controller.study.quiz.quiz02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Quiz02Controller {
	
	//localhost:8080/req1
	@GetMapping("/req1")
	public String req1(HttpServletRequest request) {
		
		System.out.println("/quiz02/req1 GET 요청");
		return "quiz/quiz02/req1";
	}
	
	//localhost:8080/req2
		@PostMapping("/req2")
		public String req2(HttpServletRequest request) {
			
			System.out.println("/quiz02/req2 GET 요청");
			return "quiz/quiz02/req2";
		}
		
		
}
