package com.app.controller.study.quiz.quiz10;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Quiz10Controller {
	
	@GetMapping("/A")
	public String A() {
		return "/quiz/quiz10/A";
	}
	
	@GetMapping("/B")
	public String B(HttpSession session) {
		
		session.setAttribute("fromb", "FromB");
		return "/quiz/quiz10/B";
	}
}
