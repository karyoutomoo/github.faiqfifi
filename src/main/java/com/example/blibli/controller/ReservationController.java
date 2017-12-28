package com.example.blibli.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ReservationController {
	@GetMapping(value = "/reserve") public ModelAndView reserve(){
		ModelAndView mav = new ModelAndView(); mav.setViewName("index");
		return mav;
	}
}
