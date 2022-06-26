package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.data.DTO.GreetingDTO;

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
	
	
}
