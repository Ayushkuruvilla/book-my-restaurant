package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class WelcomeController {

	public String welcome(Model model) {
		model.addAttribute("course", "Devops");
		return "index";
	}
}
