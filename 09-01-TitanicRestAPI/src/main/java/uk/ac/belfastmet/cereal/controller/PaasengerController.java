package uk.ac.belfastmet.cereal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PaasengerController {
@GetMapping("passengers")
public String getAllPassengers() {
	return "hello Passengers";	
}
@PostMapping("passengers")
public String postAllPassengers() {
	return "posting a message to passengers";	
}
}
