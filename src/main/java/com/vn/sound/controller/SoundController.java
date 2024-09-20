package com.vn.sound.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTsc;
import com.vn.sound.model.PowerAmplifier;
import com.vn.sound.service.MicroTscService;
import com.vn.sound.service.PowerAmplifierService;
import com.vn.sound.service.UserService;

@Controller
public class SoundController {

	@Autowired
	private MicroTscService microTscService;

	@Autowired
	private PowerAmplifierService powerAmplifierService;

	@Autowired
	private UserService userService;

	@GetMapping("/manager/login")
	public String managerLogin() {
		return "views/login";
	}

	// for Micro

	@RequestMapping(value = "/manager/micro/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findMicroById(@PathVariable Long Id) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(microTscService.findMicroTscById(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsg(Id), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllMicro(@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(
					microTscService.findAllMicroTsc(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createMicro(@RequestBody String microTscFromClient) {
		try {
			MicroTsc microTsc = Utility.convertStringToJson(microTscFromClient);
			return ResponseEntity.ok(microTscService.createMicTsc(microTsc));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editMicro(@RequestBody String microTscFromClient) {
		try {
			MicroTsc microTsc = Utility.convertStringToJson(microTscFromClient);
			return ResponseEntity.ok(microTscService.editMicTsc(microTsc));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMicro(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(microTscService.deleteMicTsc(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro/delete/multiple", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMultiMicro(@RequestBody List<String> records) {
		try {
			return ResponseEntity.ok(microTscService.deleteMultiMicTsc(records));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	// for Power Amplifier

	@RequestMapping(value = "/manager/ampli/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAmpliById(@PathVariable Long Id) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(powerAmplifierService.findAmpliById(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsg(Id), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/ampli/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllAmpli(@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(
					powerAmplifierService.findAllAmpli(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/ampli/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createAmpli(@RequestBody String ampliFromClient) {
		try {
			PowerAmplifier powerAmplifier = Utility.convertStringToJsonAmpli(ampliFromClient);
			return ResponseEntity.ok(powerAmplifierService.createAmpli(powerAmplifier));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/ampli/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editAmpli(@RequestBody String ampliFromClient) {
		try {
			PowerAmplifier powerAmplifier = Utility.convertStringToJsonAmpli(ampliFromClient);
			return ResponseEntity.ok(powerAmplifierService.editAmpliTsc(powerAmplifier));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/ampli/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteAmpli(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(powerAmplifierService.deleteAmpli(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/ampli/delete/multiple", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMultiAmpli(@RequestBody List<String> records) {
		try {
			return ResponseEntity.ok(powerAmplifierService.deleteMultiAmpli(records));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/admin-login", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> loginManager(@RequestParam(name = "userName") String userName,
			@RequestParam(name = "passWord") String passWord) {
		if (userService.isAdmin(userName, passWord)) {
			return ResponseEntity.ok("login OK");
		} else {
			return ResponseEntity.ok("login fail");
		}

	}
}
