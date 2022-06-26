package application.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import application.data.DTO.GreetingDTO;
import application.data.model.GreetingModel;


/**
 * This is a stub class, it provides functional but pointless code
 * just to confirm the application is configured and working.
 * @author neido
 *
 */

@RestController
public class DummyController {

	@GetMapping("/greeting")
	public GreetingDTO cheers(@RequestParam("suggestion") String suggestion) {
		GreetingDTO greeting = new GreetingDTO();
		if(suggestion!=null) {
			greeting.setGreeting(suggestion);
			greeting.setWasOverriden(true);
		}
		return greeting;
	}
	
	@GetMapping("/hypermedia/greeting")
	public HttpEntity<GreetingModel> hyperCheers(@RequestParam("suggestion") String suggestion) {
		GreetingModel greeting;
		if(suggestion!=null) {
			greeting = new GreetingModel(suggestion);
		}
		else {
			greeting = new GreetingModel("cheers to you!");
		}
		greeting.add(linkTo(methodOn(DummyController.class).hyperCheers(greeting.getContent())).withSelfRel());
		return new ResponseEntity<>(greeting,HttpStatus.OK);
	}
	
}
