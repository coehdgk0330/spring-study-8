package com.app.controller.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.service.hotel.HotelService;

@Controller
public class HotelController {
	
	@Autowired 
	HotelService hotelSerivce;
	
	@GetMapping("/hotel")
	public String hotel(Model model) {
		
		
		
		return "hotel/hotels";
	}
}
