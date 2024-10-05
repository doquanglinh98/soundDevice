package com.vn.sound.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/admin/login")
	public String managerLogin() {
		return "views/admin/login";
	}

//	@RequestMapping(value = "/admin-login", method = RequestMethod.POST, produces = "application/json")
//	@ResponseBody
//	public ResponseEntity<String> loginManager(@RequestParam(name = "username") String userName,
//			@RequestParam(name = "password") String passWord) {
//		// Long ref = System.currentTimeMillis();
//		if (userService.isAdmin(userName, passWord)) {
//			return ResponseEntity.ok("login OK");
//		} else {
//			return ResponseEntity.ok("login fail");
//		}
//	}

	// series redirect
	@GetMapping("/series/product/{pagename:.+}")
	public String seriesRedirect(@PathVariable("pagename") String pagename) {
		return "views/series/" + pagename;
	}
	
	// list redirect
	@GetMapping("/list/{pagename:.+}")
	public String listRedirect(@PathVariable("pagename") String pagename) {
		return "views/product/" + pagename;
	}
	
	// detail redirect
	@GetMapping("/detail/{pagename:.+}")
	public String detailRedirect(@PathVariable("pagename") String pagename) {
		return "views/detail/" + pagename;
	}

	// admin index page redirect
	@GetMapping("/admin")
	public String adminPage() {
		return "views/admin/admin-index";
	}
	
	// admin list page redirect
	@GetMapping("/admin/list/{pagename:.+}")
	public String adminListRedirect(@PathVariable("pagename") String pagename) {
		return "views/admin/" + pagename;
	}

	// admin list series page redirect
	@GetMapping("/admin/list-series")
	public String adminListSeriesPage() {
		return "views/admin/amplifier";
	}
	
	// admin add product page redirect
	@GetMapping("/admin/add/{pagename:.+}")
	public String adminAddProductPage(@PathVariable("pagename") String pagename) {
		return "views/admin/add/" + pagename;
	}
	
	// admin edit product page redirect
	@GetMapping("/admin/edit/{pagename:.+}")
	public String adminEditProductPage(@PathVariable("pagename") String pagename) {
		return "views/admin/edit/" + pagename;
	}
	
}
