package com.vn.sound.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.NotAcceptableStatusException;

import com.vn.sound.Service.Service;
import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTsc;

@Controller
public class SoundController {

	@Autowired
	private Service tscService;

	@GetMapping("/manager/login")
	public String managerLogin() {
		return "views/login";
	}

	@RequestMapping(value = "/manager/micro/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findMicroById(@PathVariable Long Id) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(tscService.findMicroTscById(Id)));
		} catch (Exception e) {
			return ResponseEntity.ofNullable(Utility.errMsg(Id));
		}
	}

	@RequestMapping(value = "/manager/micro/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllMicro() {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(tscService.findAllMicroTsc()));
		} catch (Exception e) {
			return ResponseEntity.ofNullable(Utility.errMsgAll());
		}
	}

	@RequestMapping(value = "/manager/micro/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createMicro(@RequestBody String microTscFromClient) {
		try {
			MicroTsc microTsc = Utility.convertStringToJson(microTscFromClient);
			return ResponseEntity.ok(tscService.createMicTsc(microTsc));
		} catch (Exception e) {
			return ResponseEntity.ofNullable(Utility.errMsgInvalid());
		}
	}

	@RequestMapping(value = "/manager/micro/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editMicro(@RequestBody String microTscFromClient) {
		try {
			MicroTsc microTsc = Utility.convertStringToJson(microTscFromClient);
			return ResponseEntity.ok(tscService.editMicTsc(microTsc));
		} catch (Exception e) {
			return ResponseEntity.ofNullable(Utility.errMsgInvalid());
		}
	}

	@RequestMapping(value = "/manager/micro/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMicro(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(tscService.deleteMicTsc(Long.parseLong(Id)));
		} catch (Exception e) {
			return ResponseEntity.ofNullable(Utility.errMsgInvalid());
		}
	}
	
	@RequestMapping(value = "/manager/micro/delete/multiple", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMultiMicro(@RequestBody List<String> records) {
		try {
			return ResponseEntity.ok(tscService.deleteMultiMicTsc(records));
		} catch (Exception e) {
			return ResponseEntity.ofNullable(Utility.errMsgInvalid());
		}
	}
}
