package com.app.controller.study.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.util.MyCookieUtil;

@Controller
public class Cookie02Controller {
	
	// 쿠키 활용 -> 아이디 기억
	
	@GetMapping("/idCookie")
	public String idCookie(HttpServletRequest request) {
		
		String remember = MyCookieUtil.getCookieValue(request, "remember");
		
		if(remember != null) {
			request.setAttribute("remember", remember);
		}
		return "cookie/idCookie";
	}
	
	@PostMapping("/idCookie")
	public String idCookieAction(HttpServletRequest request, HttpServletResponse response) {
		// 로직처리
		// 입력 유효성검증
		// id pew <-> DB 데이터
		// 로그인 성공/실패 여부 판단 -> 성공? 성공페이지 이동
		//					   -> 실패? 로그인페이지 이동
		
		System.out.println( request.getParameter("id"));
		System.out.println( request.getParameter("pw"));
		System.out.println( request.getParameter("remember"));
		
		// 체크박스 -> 체크안하면 null  체크하면 value속성값 | value 속성없으면 on
		
		// 로그인 성공...으로 간주
		
		// 체크박스역할 아이디기억 -> 체크 O -> 쿠키에 아이디를 저장
		
		
		String id = request.getParameter("id");
		String remember = request.getParameter("remember");
		
		if(remember == null) {
			
			
		}else {
			
			boolean isRemember = Boolean.parseBoolean(remember);
			
			//id 값 쿠키에 저장
			Cookie ck = MyCookieUtil.createCookie("remember", id, 60*60);
			response.addCookie(ck);
					
			
		}
		
		
		return "redirect:/readCookie";
	}
	
}






















