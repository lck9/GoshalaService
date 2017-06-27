package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fusion.GoshalaStore;
import com.fusion.Response;

import model.Gallery;
import model.GoshalaData;
import model.Members;
import service.GoshalaService;

@RestController
public class GoshalaController {
	
	
	@Autowired(required = true)
	GoshalaService goshalaService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public Response hello() {
		String hello = "Hello app started";
		return new Response(true, "OK", hello);
	}
	
	@RequestMapping(value = "/getAllGoshalaData", method = RequestMethod.GET, headers = "Accept=application/json")
	public Response getAllGoshalaData() {
		List<GoshalaStore> list = goshalaService.getAllGoshalaData();
		return new Response(true, "OK", list);
	}
	
	@RequestMapping(value = "/addGoshalaData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addGoshalaData(@Valid @RequestBody GoshalaData goshalaData) {	
		return new Response(true, "OK", goshalaService.addGoshalaData(goshalaData));
	}
	
	@RequestMapping(value = "/addMembers", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addMembers(@Valid @RequestBody Members members) {	
		return new Response(true, "OK", goshalaService.addMembers(members));
	}
	
	@RequestMapping(value = "/addGallery", method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addGallery(@Valid @RequestBody Gallery gallery) {	
		return new Response(true, "OK", goshalaService.addGallery(gallery));
	}

	/*@RequestMapping(value = "/getSensor/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Sensor getSensorById(@PathVariable int id) {
		return SensorService.getSensor(id);
	}

	@RequestMapping(value = "/temperature", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addTemperature(@RequestBody Sensor Sensor) {	
		System.out.println("output value="+Sensor.getSensorType());
		SensorService.addSensor(Sensor);
	}
	
	@RequestMapping(value = "/distance", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addDistance(@RequestBody Sensor Sensor) {	
		System.out.println("output value="+Sensor.getSensorType());
		SensorService.addSensor(Sensor);
	}
	
	@RequestMapping(value = "/soil", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addSoil(@RequestBody Sensor Sensor) {	
		System.out.println("output value="+Sensor.getSensorType());
		SensorService.addSensor(Sensor);
	}
	
	@RequestMapping(value = "/water", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addWater(@RequestBody Sensor Sensor) {	
		System.out.println("output value="+Sensor.getSensorType());
		SensorService.addSensor(Sensor);
	}

	@RequestMapping(value = "/updateSensor", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateSensor(@RequestBody Sensor Sensor) {
		SensorService.updateSensor(Sensor);
	}

	@RequestMapping(value = "/deleteSensor/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteSensor(@PathVariable("id") int id) {
		SensorService.deleteSensor(id);		
	}	*/
}
