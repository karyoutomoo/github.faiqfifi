package com.example.blibli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/login")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/index")
	public String index2() {
		return "index";
	}
	
	@RequestMapping("/reserve")
	public String index3() {
		return "reserve";
	}
	
	@RequestMapping("/availability")
	public String index4() {
		return "availability";
	}
	
	@RequestMapping("/ledger")
	public String index5() {
		return "ledger";
	}
	
	@RequestMapping("/room")
	public String index6() {
		return "room";
	}
}
