package com.vn.sound.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@GetMapping("/about-us")
	public String introPage() {
		return "views/about-us";
	}

	@GetMapping("/admin-login")
	public String managerLogin() {
		return "views/admin/login";
	}

	@RequestMapping(value = "/admin-login/verification", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> loginManager(@RequestParam(name = "username") String userName,
			@RequestParam(name = "password") String passWord) {
		if (userService.isAdmin(userName, passWord)) {
			return ResponseEntity.status(HttpStatus.OK).body("login OK");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("login fail");
		}
	}

	// series redirect
	@GetMapping("/series/{pagename:.+}/{seriesName}")
	public String seriesRedirect(@PathVariable("pagename") String pagename,
			@PathVariable("seriesName") String seriesName, Model model) {
		model.addAttribute("seriesName", seriesName);
		return "views/series/" + pagename;
	}

	// list redirect
	@GetMapping("/list/{pagename:.+}")
	public String listRedirect(@PathVariable("pagename") String pagename) {
		return "views/product/" + pagename;
	}

	// detail redirect
	@GetMapping("/detail/{pagename:.+}/{id}")
	public String detailRedirect(@PathVariable("pagename") String pagename, @PathVariable("id") String id,
			Model model) {
		model.addAttribute("id", id);
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
		return "views/admin/series/series-product";
	}

	// admin add product page redirect
	@GetMapping("/admin/add/{pagename:.+}")
	public String adminAddProductPage(@PathVariable("pagename") String pagename) {
		return "views/admin/add/" + pagename;
	}

	// admin edit product page redirect
	@GetMapping("/admin/edit/{pagename:.+}/{id}")
	public String adminEditProductPage(@PathVariable("pagename") String pagename, @PathVariable("id") String id,
			Model model) {
		model.addAttribute("id", id);
		return "views/admin/edit/" + pagename;
	}

}
