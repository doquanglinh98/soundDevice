package com.vn.sound.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.vn.sound.common.Service;
import com.vn.sound.common.Utility;
import com.vn.sound.model.Amplifier;
import com.vn.sound.repository.AmplifierRepository;

@Controller
public class SoundController {

	@Autowired
	private Service service;

	@Autowired
	private AmplifierRepository amplifierRepository;

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

	@PostMapping("/manager/amplifier/create")
	public ResponseEntity<String> amplifierCreate(@RequestBody Amplifier amplifier) {
		service.saveAmplifier(amplifier);
		if (service.exitsAmplifier(amplifier.getIdImg())) {
			return new ResponseEntity<>("Create successfully", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Create not successfully", HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/manager/amplifier/edit")
	public ResponseEntity<String> amplifierEdit(@RequestBody Amplifier amplifier) {
		if (amplifierRepository.existsById(amplifier.getId())) {
			service.saveAmplifier(amplifier);
			return new ResponseEntity<>("Update successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Not found record with ID = " + amplifier.getId(), HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/manager/amplifier/delete/{ID}")
	public ResponseEntity<String> amplifierDel(@RequestParam Long id) {
		if (amplifierRepository.existsById(id)) {
			if (service.delAmplifier(id)) {
				return new ResponseEntity<>("Delete successfully", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Delete not successfully", HttpStatus.BAD_REQUEST);
			}
		} else {
			return new ResponseEntity<>("Not found record with ID = " + id, HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/manager/amplifier/search")
	public ResponseEntity<List<Amplifier>> amplifierFindAll() {
		List<Amplifier> amplifiers = amplifierRepository.findAll();
		return ResponseEntity.ok(amplifiers);
	}

	@PostMapping("/manager/amplifier/search/{key}")
	public ResponseEntity<List<Amplifier>> amplifierFindByKey(@RequestParam String name) {
		List<Amplifier> amplifiers = amplifierRepository.findAmplifierBysystemAmplifier(name);
		return ResponseEntity.ok(amplifiers);
	}
}
