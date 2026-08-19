package com.app.controller.study.quiz.quiz19;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quiz19Controller {

	@GetMapping("/quiz19/quiz1")
	public String quiz1() {
		return "quiz/quiz19/quiz19";
	}

	@ResponseBody
	@GetMapping("/quiz19/quiz2")
	public String quiz2() {
		return "return text quiz2";
	}
	
	@ResponseBody
	@GetMapping("/quiz19/quiz3")
	public String quiz3() {
//		{
//			"id":"quizid",
//			"pw":"secret",
//			"name":"quiz이름",
//			"userType":"CUS"
//		}
		String result = "{\r\n"
				+ "			\"id\":\"quizid\",\r\n"
				+ "			\"pw\":\"secret\",\r\n"
				+ "			\"name\":\"quiz이름\",\r\n"
				+ "			\"userType\":\"CUS\"\r\n"
				+ "		}";
		return result;
	}

}
