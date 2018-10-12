package com.training.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Book;

@Controller
public class WelcomeController {

	@Autowired
	ModelAndView mdlView;

	@Autowired
	Book book;

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

	@RequestMapping(value = "addBook", method = RequestMethod.GET)
	public ModelAndView initAddBook() {

		mdlView.addObject("command", book);
		mdlView.setViewName("AddBook");

		return mdlView;
	}

	@RequestMapping(value = "addBook", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("command") Book bk, BindingResult result) {

		if (result.hasErrors()) {

			return "AddBook";

		} else {

			return "Success";
		}

	}

	@ModelAttribute("catList")
	public String[] getCategories() {

		return new String[] { "Fiction", "History", "Self Improvement" };
	}
}
