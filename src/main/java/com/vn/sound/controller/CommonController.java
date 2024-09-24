package com.vn.sound.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vn.sound.common.Utility;
import com.vn.sound.service.UserService;

@Controller
public class CommonController {

	@Autowired
	private UserService userService;

	@GetMapping("/info")
	ResponseEntity<String> inf() {
		Long ref = System.currentTimeMillis();
		Utility.logMessage(ref, "Health check!!!");
		return new ResponseEntity<>("App is running!", HttpStatus.OK);
	}

	@GetMapping("/")
	public String index() {
		return "views/home";
	}

	@GetMapping("/manager/login")
	public String managerLogin() {
		return "views/login";
	}

	@RequestMapping(value = "/admin-login", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> loginManager(@RequestParam(name = "username") String userName,
			@RequestParam(name = "password") String passWord) {
		// Long ref = System.currentTimeMillis();
		if (userService.isAdmin(userName, passWord)) {
			return ResponseEntity.ok("login OK");
		} else {
			return ResponseEntity.ok("login fail");
		}
	}

}
