package com.soumyadeep.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/api/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
}
