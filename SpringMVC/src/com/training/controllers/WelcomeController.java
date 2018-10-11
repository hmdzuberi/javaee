package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@Autowired
	ModelAndView mdlView;

	@RequestMapping("/")
	public ModelAndView init() {

		mdlView.addObject("heading", "Spring MVC");
		mdlView.setViewName("index");

		return mdlView;
	}

	@RequestMapping("names")
	public ModelAndView getNames() {

		mdlView.addObject("names1", "Hamaad");
		mdlView.addObject("names2", "Ayush");

		mdlView.setViewName("names");

		return mdlView;
	}

}
