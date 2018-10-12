package com.training.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Wonder;

@Controller
public class WelcomeController {

	@Autowired
	ModelAndView mdlView;

	@Autowired
	Wonder wonder;

	@RequestMapping("/")
	public ModelAndView init() {

		mdlView.setViewName("index");

		return mdlView;
	}

	@RequestMapping(value = "addWonder", method = RequestMethod.GET)
	public ModelAndView initAddWonder() {

		mdlView.addObject("command", wonder);
		mdlView.setViewName("AddWonder");

		return mdlView;
	}

	@RequestMapping(value = "addWonder", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("command") Wonder wonder, BindingResult result) {

		if (result.hasErrors()) {

			return "AddWonder";

		} else {

			return "Success";
		}
	}

	@ModelAttribute("continentList")
	public String[] getContinents() {

		return new String[] { "Asia", "Africa", "North America", "South America", "Europe", "Antartica", "Oceania" };
	}

	@ModelAttribute("categoryList")
	public String[] getCategories() {

		return new String[] { "Modern", "Ancient" };
	}

}
