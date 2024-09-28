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

import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTsc;
import com.vn.sound.model.MicroTscSeries;
import com.vn.sound.model.Mixer;
import com.vn.sound.model.MixerSeries;
import com.vn.sound.model.N9SpeakerSeries;
import com.vn.sound.model.N9SpeakerSeriesAllProducts;
import com.vn.sound.model.PowerAmplifier;
import com.vn.sound.model.PowerAmplifierSeries;
import com.vn.sound.service.MicroTscSeriesService;
import com.vn.sound.service.MicroTscService;
import com.vn.sound.service.MixerSeriesService;
import com.vn.sound.service.MixerService;
import com.vn.sound.service.N9SpeakerSeriesAllProductsService;
import com.vn.sound.service.N9SpeakerSeriesService;
import com.vn.sound.service.PowerAmplifierSeriesService;
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

	@Autowired
	private MicroTscSeriesService microTscSeriesService;

	@Autowired
	private PowerAmplifierSeriesService powerAmplifierSeriesService;

	@Autowired
	private MixerService mixerService;

	@Autowired
	private MixerSeriesService mixerSeriesService;

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

	@RequestMapping(value = "/manager/micro/find-by-keyword/{pattern}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findMicroByName(@PathVariable String pattern) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(microTscService.findMicroTscByName(pattern)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createMicro(@RequestBody String microTscFromClient) {
		MicroTsc microTsc = null;
		try {
			microTsc = Utility.convertStringToJson(microTscFromClient);
			return ResponseEntity.ok(microTscService.createMicTsc(microTsc));
		} catch (CustomException e) {
			return new ResponseEntity<>(Utility.errMsgCreateFieldNameExits(microTsc.getMicroName().toString()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			System.out.println("loi roi="+e);
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
		PowerAmplifier powerAmplifier = null;
		try {
			powerAmplifier = Utility.convertStringToJsonAmpli(ampliFromClient);
			return ResponseEntity.ok(powerAmplifierService.createAmpli(powerAmplifier));
		} catch (CustomException e) {
			return new ResponseEntity<>(Utility.errMsgCreateFieldNameExits(powerAmplifier.getMode().toString()),
					HttpStatus.BAD_REQUEST);
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

	@RequestMapping(value = "/manager/speakers-series/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findSpeakersSeriesById(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity
					.ok(Utility.jsonStringConverter(n9SpeakerSeriesService.findSpeakerSeriesById(Long.parseLong(Id))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/speakers-series/all", method = RequestMethod.GET, produces = "application/json")
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

	@RequestMapping(value = "/manager/speakers-series/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createN9Speaker(@RequestBody String n9SpeakerFromClient) {
		N9SpeakerSeries n9SpeakerSeries = null;
		try {
			n9SpeakerSeries = Utility.convertStringToJsonN9SpeakerSeries(n9SpeakerFromClient);
			return ResponseEntity.ok(n9SpeakerSeriesService.createN9SpeakerSeries(n9SpeakerSeries));
		} catch (CustomException e) {
			return new ResponseEntity<>(Utility.errMsgCreateFieldNameExits(n9SpeakerSeries.getSeriesName().toString()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/speakers-series/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editN9Speaker(@RequestBody String n9SpeakerFromClient) {
		try {
			N9SpeakerSeries n9SpeakerSeries = Utility.convertStringToJsonN9SpeakerSeries(n9SpeakerFromClient);
			return ResponseEntity.ok(n9SpeakerSeriesService.editN9SpeakerSeries(n9SpeakerSeries));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/speakers-series/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
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
		N9SpeakerSeriesAllProducts n9SpeakerSeriesAllProducts = null;
		try {
			n9SpeakerSeriesAllProducts = Utility
					.convertStringToJsonN9SpeakerSeriesAllProducts(n9SpeakerSeriesFromClient);
			return ResponseEntity
					.ok(n9SpeakerSeriesAllProductsService.createN9SpeakerSeries(n9SpeakerSeriesAllProducts));
		} catch (CustomException e) {
			return new ResponseEntity<>(
					Utility.errMsgCreateFieldNameExits(n9SpeakerSeriesAllProducts.getN9SpeakerSeriesName().toString()),
					HttpStatus.BAD_REQUEST);
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
	public ResponseEntity<String> findN9SpeakerSeriesByName(@PathVariable String pattern) {
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

	// for MicroTscSeries
	@RequestMapping(value = "/manager/micro-tsc-series/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllMicroTscSeries(@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(
					microTscSeriesService.findAllMicroTscSeries(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro-tsc-series/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findMicroSeriesById(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity
					.ok(Utility.jsonStringConverter(microTscSeriesService.findMicroSeriesById(Long.parseLong(Id))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro-tsc-series/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createMicroTscSeries(@RequestBody String microTscSeriesFromClient) {
		MicroTscSeries microTscSeries = null;
		try {
			microTscSeries = Utility.convertStringToJsonMicroSeries(microTscSeriesFromClient);
			return ResponseEntity.ok(microTscSeriesService.createMicroTscSeries(microTscSeries));
		} catch (CustomException e) {
			return new ResponseEntity<>(Utility.errMsgCreateFieldNameExits(microTscSeries.getSeriesName().toString()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro-tsc-series/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editMicroTscSeries(@RequestBody String microTscSeriesFromClient) {
		try {
			MicroTscSeries microTscSeries = Utility.convertStringToJsonMicroSeries(microTscSeriesFromClient);
			return ResponseEntity.ok(microTscSeriesService.editMicroTscSeries(microTscSeries));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/micro-tsc-series/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMicroTscSeries(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(microTscSeriesService.deleteMicroTscSeries(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	// for PowerAmplifierSeries
	@RequestMapping(value = "/manager/power-ampli-series/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllPowerAmpliSeries(@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(powerAmplifierSeriesService
					.findAllPowerAmplifierSeries(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/power-ampli-series/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAmpliSeriesById(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(
					Utility.jsonStringConverter(powerAmplifierSeriesService.findAmpliSeriesById(Long.parseLong(Id))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/power-ampli-series/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createPowerAmpliSeries(@RequestBody String powerAmpliSeriesFromClient) {
		PowerAmplifierSeries powerAmplifierSeries = null;
		try {
			powerAmplifierSeries = Utility.convertStringToJsonAmpliSeries(powerAmpliSeriesFromClient);
			return ResponseEntity.ok(powerAmplifierSeriesService.createPowerAmplifierSeries(powerAmplifierSeries));
		} catch (CustomException e) {
			return new ResponseEntity<>(
					Utility.errMsgCreateFieldNameExits(powerAmplifierSeries.getSeriesName().toString()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/power-ampli-series/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editPowerAmpliSeries(@RequestBody String powerAmpliSeriesFromClient) {
		try {
			PowerAmplifierSeries powerAmplifierSeries = Utility
					.convertStringToJsonAmpliSeries(powerAmpliSeriesFromClient);
			return ResponseEntity.ok(powerAmplifierSeriesService.editPowerAmplifierSeries(powerAmplifierSeries));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/power-ampli-series/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deletePowerAmpliSeries(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(powerAmplifierSeriesService.deletePowerAmplifierSeries(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	// for Mixer
	@RequestMapping(value = "/manager/mixer/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllMixer(@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility
					.jsonStringConverter(mixerService.findAllMixer(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findMixerId(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(mixerService.findMixerById(Long.parseLong(Id))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createMixer(@RequestBody String mixerFromClient) {
		Mixer mixer = null;
		try {
			mixer = Utility.convertStringToJsonMixer(mixerFromClient);
			return ResponseEntity.ok(mixerService.createMixer(mixer));
		} catch (CustomException e) {
			return new ResponseEntity<>(Utility.errMsgCreateFieldNameExits(mixer.getModelMixer().toString()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editMixer(@RequestBody String mixerFromClient) {
		try {
			Mixer mixer = Utility.convertStringToJsonMixer(mixerFromClient);
			return ResponseEntity.ok(mixerService.editMixer(mixer));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMixer(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(mixerService.deleteMixer(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer/find-by-keyword/{pattern}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findMixerByModel(@PathVariable String pattern) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(mixerService.findMixerByModel(pattern)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	// for MixerSeries
	@RequestMapping(value = "/manager/mixer-series/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findAllMixerSeries(@RequestParam(defaultValue = "0", name = "page") String page,
			@RequestParam(defaultValue = "10", name = "size") String size) {
		try {
			return ResponseEntity.ok(Utility.jsonStringConverter(
					mixerSeriesService.findAllMixerSeries(Integer.parseInt(page), Integer.parseInt(size))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer-series/{Id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> findMixerSeriesById(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity
					.ok(Utility.jsonStringConverter(mixerSeriesService.findMixerSeriesById(Long.parseLong(Id))));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer-series/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> createMixerSeries(@RequestBody String mixerSeriesFromClient) {
		MixerSeries mixerSeries = null;
		try {
			mixerSeries = Utility.convertStringToJsonMixerSeries(mixerSeriesFromClient);
			return ResponseEntity.ok(mixerSeriesService.createMixerSeries(mixerSeries));
		} catch (CustomException e) {
			return new ResponseEntity<>(Utility.errMsgCreateFieldNameExits(mixerSeries.getSeriesName().toString()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer-series/edit", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> editMixerSeries(@RequestBody String mixerSeriesFromClient) {
		try {
			MixerSeries mixerSeries = Utility.convertStringToJsonMixerSeries(mixerSeriesFromClient);
			return ResponseEntity.ok(mixerSeriesService.editMixerSeries(mixerSeries));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/mixer-series/delete/{Id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> deleteMixerSeries(@PathVariable(name = "Id") String Id) {
		try {
			return ResponseEntity.ok(mixerSeriesService.deleteMixerSeries(Long.parseLong(Id)));
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/manager/count/product", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> countProduct() {
		try {
			return ResponseEntity.ok(n9SpeakerSeriesAllProductsService.countProduct());
		} catch (Exception e) {
			return new ResponseEntity<>(Utility.errMsgInvalid(), HttpStatus.BAD_REQUEST);
		}
	}

}
