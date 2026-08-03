package com.app.controller.study.quiz.quiz01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Quiz01Controller {
	
	@GetMapping("/main")
	public String main() {
		return "quiz/quiz01/main";
	}
	
	@GetMapping("/mouse")
	public String mouse() {
		return "quiz/quiz01/product/mouse";
	}
	
	@GetMapping("/keyboard")
	public String keyboard() {
		return "quiz/quiz01/product/keyboard";
	}

}
