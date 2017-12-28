package com.example.blibli.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
	@GetMapping(value = "/") public ModelAndView index(){
		ModelAndView home = new ModelAndView(); home.setViewName("index");
		return home;
	}
}