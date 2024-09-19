package com.vn.sound.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {
	@GetMapping("/info")
	ResponseEntity<String> inf() {
		return new ResponseEntity<>("App is running!", HttpStatus.OK);
	}

	@GetMapping("/")
	public String index() {
		return "views/home";
	}

}
