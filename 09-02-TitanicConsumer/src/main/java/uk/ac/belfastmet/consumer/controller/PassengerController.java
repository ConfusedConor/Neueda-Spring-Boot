package uk.ac.belfastmet.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.consumer.domain.AllPassengers;
import uk.ac.belfastmet.consumer.domain.Passenger;
import uk.ac.belfastmet.consumer.service.PassengerService;
@Controller
@RequestMapping("/titanic")
public class PassengerController {
	@Autowired
	PassengerService passengerService;
AllPassengers allPassengers;

public PassengerController(PassengerService passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}
@GetMapping("/{passengerId}")
public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
	model.addAttribute("pageTitle", "View Passenger");
	RestTemplate restTemplate = new RestTemplate();
	Passenger passenger= this.passengerService.get(passengerId);
	model.addAttribute("passenger", passenger);
	
	return "viewPassenger";
	
}

}


