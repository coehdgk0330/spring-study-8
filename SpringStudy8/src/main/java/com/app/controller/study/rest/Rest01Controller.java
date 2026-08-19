package com.app.controller.study.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rest01Controller {

	@GetMapping("/rest/rest01")
	public String rest01() {

		return "rest/rest01"; // view 경로 지원
	}
	
	@ResponseBody
	@GetMapping("/rest/rest02")
	public String rest02() {

		return "rest/rest02"; // view 경로 지원
	}
	
	@ResponseBody
	@GetMapping("/rest/rest03")
	public String rest03() {

		return "text test rest api test"; // view 경로 지원
	}
}
