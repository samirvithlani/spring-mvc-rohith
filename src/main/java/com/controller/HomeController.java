package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// model,modelmap
	// model is an interface
	@RequestMapping("/home")
	public String Home(Model model) {
		String name = "samir";
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");
		// request.setAttribute("name",name);
		model.addAttribute("n", name);
		model.addAttribute("names", names);
		return "home";
	}

	@RequestMapping("/demo")
	public String Demo() {

		return "dashboard";
	}

}
