package com.vn.sound.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vn.sound.common.Service;
import com.vn.sound.common.Utility;

@Controller
public class SoundController {
	
	@Autowired
	private Service service;

	@GetMapping("/info")
	ResponseEntity<String> inf() {
		return new ResponseEntity<>("App is running!", HttpStatus.OK);
	}

	@GetMapping("/")
	public String index() {
		return "views/home";
	}

	@GetMapping("/login")
	public String login() {
		return "views/login";
	}

	@PostMapping("/manager")
	public String loginWeb(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, @RequestParam(name = "authencode") String authencode) {
		System.out.println("username=" + username + ", password=" + password + ", authencode=" + authencode);
		if (Utility.isAccess(username, password, authencode)) {
			if (service.isAdmin(username, password)) {
				System.out.println("Login OK");
				return "views/manager";
			}
			return "views/denyPage";
		} else {
			return "views/denyPage";
		}
	}

	@GetMapping("/deny")
	public String deny() {

		return "views/denyPage";
	}
}
