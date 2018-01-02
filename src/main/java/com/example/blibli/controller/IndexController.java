package com.example.blibli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	private static final String BASE_PATH = "/";

    @GetMapping(value = IndexController.BASE_PATH)
    public ModelAndView getBaseView() {
        return new ModelAndView("index");
	}
}