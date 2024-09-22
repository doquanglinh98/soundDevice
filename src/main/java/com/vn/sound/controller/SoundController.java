package com.vn.sound.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTsc;
import com.vn.sound.model.N9SpeakerSeries;
import com.vn.sound.model.N9SpeakerSeriesAllProducts;
import com.vn.sound.model.PowerAmplifier;
import com.vn.sound.service.MicroTscService;
import com.vn.sound.service.N9SpeakerSeriesAllProductsService;
import com.vn.sound.service.N9SpeakerSeriesService;
import com.vn.sound.service.PowerAmplifierService;

@Controller
public class SoundController {

	@Autowired
	private MicroTscService microTscService;

	@Autowired
	private PowerAmplifierService powerAmplifierService;

	@Autowired
	private N9SpeakerSeriesService n9SpeakerSeriesService;

	@Autowired
	private N9SpeakerSeriesAllProductsService n9SpeakerSeriesAllProductsService;

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

	@RequestMapping(value = "/manager/ampli/find-by-keyword/{pattern}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAmpliByMode(@PathVariable String pattern) {
		try {
			return ResponseEntity
					.ok(Utility.jsonStringConverter(powerAmplifierService.findPowerAmplifierByMode(pattern)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
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

	// N9 Speaker Series

	@RequestMapping(value = "/manager/n9speaker/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllN9SpeakerSeries(@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(
					n9SpeakerSeriesService.findAllN9SpeakerSeries(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9speaker/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createN9Speaker(@RequestBody String n9SpeakerFromClient) {
		try {
			N9SpeakerSeries n9SpeakerSeries = Utility.convertStringToJsonN9SpeakerSeries(n9SpeakerFromClient);
			return ResponseEntity.ok(n9SpeakerSeriesService.createN9SpeakerSeries(n9SpeakerSeries));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9speaker/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editN9Speaker(@RequestBody String n9SpeakerFromClient) {
		try {
			N9SpeakerSeries n9SpeakerSeries = Utility.convertStringToJsonN9SpeakerSeries(n9SpeakerFromClient);
			return ResponseEntity.ok(n9SpeakerSeriesService.editN9SpeakerSeries(n9SpeakerSeries));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9speaker/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteN9Speaker(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(n9SpeakerSeriesService.deleteN9SpeakerSeries(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	// for N9SpeakerSeriesAllProducts

	@RequestMapping(value = "/manager/n9-speaker-series/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findN9SpeakerSeriesById(@PathVariable Long Id) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverterRemoveNullSpeakerSeries(
					n9SpeakerSeriesAllProductsService.findN9SpeakerSeriesAllProductsById(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsg(Id), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9-speaker-series/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createN9SpeakerSeries(@RequestBody String n9SpeakerSeriesFromClient) {
		try {
			N9SpeakerSeriesAllProducts n9SpeakerSeriesAllProducts = Utility
					.convertStringToJsonN9SpeakerSeriesAllProducts(n9SpeakerSeriesFromClient);
			return ResponseEntity
					.ok(n9SpeakerSeriesAllProductsService.createN9SpeakerSeries(n9SpeakerSeriesAllProducts));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9-speaker-series/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editN9SpeakerSeries(@RequestBody String n9SpeakerSeriesFromClient) {
		try {
			N9SpeakerSeriesAllProducts n9SpeakerSeriesAllProducts = Utility
					.convertStringToJsonN9SpeakerSeriesAllProducts(n9SpeakerSeriesFromClient);
			return ResponseEntity.ok(n9SpeakerSeriesAllProductsService.editN9SpeakerSeries(n9SpeakerSeriesAllProducts));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9-speaker-series/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteN9SpeakerSeries(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(n9SpeakerSeriesAllProductsService.deleteN9SpeakerSeries(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9-speaker-series/find-by-keyword/{pattern}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findN9SpeakerSeriesById(@PathVariable String pattern) {
		try {
			return ResponseEntity.ok(Utility
					.jsonStringConverter(n9SpeakerSeriesAllProductsService.findAllN9SpeakerSeriesByName(pattern)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/n9-speaker-series/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllProductOfSpeakerSeries(
			@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(n9SpeakerSeriesAllProductsService
					.findAllProductOfSpeakerSeries(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}
}
