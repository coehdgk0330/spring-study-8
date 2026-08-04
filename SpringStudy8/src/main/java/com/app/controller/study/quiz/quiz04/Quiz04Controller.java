package com.app.controller.study.quiz.quiz04;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class Quiz04Controller {

	@GetMapping("/request1-1")
	public String request1_1(HttpServletRequest request) {
		
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("product"));
		
		
		return "quiz/quiz04/req";
	}
	
	@GetMapping("/request1-2")
	public String request1_2(@RequestParam(required = false) int category,
							 @RequestParam(required = false) int product) {
		
		System.out.println(category);
		System.out.println(product);
		
		
		return "quiz/quiz04/req";
	}
	
	@GetMapping("/request1-3")
	public String request1_3(@ModelAttribute Product product) {
		
		
		System.out.println( product.getCategory() );
		System.out.println( product.getProduct() );
		
		return "quiz/quiz04/req";
	}
	
	@GetMapping("/request1-4")
	public String request1_3(@RequestParam Map<String, String> paramMap)  {
		
		
		System.out.println( paramMap.get("category"));
		System.out.println( paramMap.get("product"));
		
		return "quiz/quiz04/req";
	}
	
	@GetMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {
		
		request.setAttribute("category", "100");
		request.setAttribute("product", "4000");
		
		return "quiz/quiz04/viewData";
	}
	
	@GetMapping("/viewData1-2")
	public String viewData1_2(Model model) {
		
		model.addAttribute("category","200");
		model.addAttribute("product","5000");
		
		return "quiz/quiz04/viewData";
	}
	
	@GetMapping("/viewData1-3")
	public ModelAndView viewData1_3() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("quiz/quiz04/viewData");
		
		mav.addObject("category","300");
		mav.addObject("product","6000");
		
		return mav;
	}
	
	@GetMapping("/viewData1-4")
	public String viewData1_4(@ModelAttribute Product product , Model model) {
		
		
		Product product1 = new Product();
		product1.setCategory(700);
		product1.setProduct(10000);
		model.addAttribute("product",product1);
		
		return "quiz/quiz04/viewData";
		//화면에 객체로 전달

		
	}
	
}





























