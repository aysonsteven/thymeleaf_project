package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainUIController {

	@GetMapping
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/about")
	public String getAbout() {
		return "about";
	}
	
	@GetMapping("/services")
	public String getServices() {
		return "services";
	}
	
	@GetMapping("/builder")
	public String getBuilder() {
		return "builder";
	}
}
