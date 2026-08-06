package com.app.controller.study.quiz.quiz07;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.request.Member;
import com.app.dto.study.request.Product;

@Controller
@RequestMapping("/quiz07")
public class Quiz07Controller {	
	
	@GetMapping("/listTest")
	public String listTest(@RequestParam("type")String type, Model model) {
		
		if ("str".equals(type)) {
			List<String> strList = new ArrayList<>();
			
		for(int i=0; i<10; i++) {
		System.out.println("스트링 리스트입니다.");
		}
		model.addAttribute("msgList", strList);
		}
		return "quiz/quiz07/listTest";
	}
	
	@GetMapping("/member")
	public String member(@RequestParam("type")String type, Model model) {
	    
		if ("member".equals(type)) {
			
	    List<Member> memberList = new ArrayList<Member>();
	    
	    memberList.add(new Member("아이디1", "비번1", "이름1"));
	    memberList.add(new Member("아이디2", "비번3", "이름4"));
	    memberList.add(new Member("아이디3", "비번3", "이름3"));
	    memberList.add(new Member("아이디4", "비번4", "이름4"));
	    memberList.add(new Member("아이디5", "비번5", "이름5"));
	    
	    
	    model.addAttribute("memberList", memberList);
	    
	    for (Member m : memberList) {
            System.out.println(m.getId() + m.getPw() +  m.getName());
        }
	    
		}
	    return "quiz/quiz07/member"; 
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
