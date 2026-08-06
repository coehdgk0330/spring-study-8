package com.app.controller.study.quiz.quiz08;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz08")
public class Quiz08Controller {

	@GetMapping("/member")
	public String member(@RequestParam(name = "auth") String type, Model model) {

		List<Member> memberList = new ArrayList<Member>();

		memberList.add(new Member("user1", "pass123", "홍길동", "basic"));
		memberList.add(new Member("user2", "pass456", "김철수", "manager"));
		memberList.add(new Member("user3", "pass789", "이영희", "basic"));
		memberList.add(new Member("user4", "passabc", "박민지", "manager"));
		memberList.add(new Member("user5", "passdef", "정재영", "basic"));
		memberList.add(new Member("user6", "passxyz", "최성민", "basic"));
		memberList.add(new Member("user7", "pass123", "서지원", "manager"));
		memberList.add(new Member("user8", "pass456", "장성호", "basic"));
		memberList.add(new Member("user9", "pass789", "신지수", "basic"));
		memberList.add(new Member("user10", "passabc", "한영희", "manager"));

		if ("basic".equals(type)) {

			List<Member> basicList = new ArrayList<>();

			
			for (Member m : memberList) {
				if ("basic".equals(m.getType())) {
					basicList.add(m);
				}
			}
			model.addAttribute("basicList", basicList);
			
		}else if ("manager".equals(type)) {
			List<Member> managerList = new ArrayList<>();
			
			for (Member m : memberList) {
				if("manager".equals(m.getType())) {
					managerList.add(m);
				}
			}
			model.addAttribute("managerList", managerList);
			
		}else if ("admin".equals(type)){
			model.addAttribute("admin", memberList);
		}else {
			model.addAttribute("memberList", memberList);
		}

		return "quiz/quiz08/member";
	}

}































