package com.wipro.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/")
	public String home() {
		return "Welcome My page";
	}

}
