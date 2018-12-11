package uk.ac.belfastmet.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.consumer.domain.AllPassengers;
import uk.ac.belfastmet.consumer.domain.Passenger;
import uk.ac.belfastmet.consumer.service.PassengerServiceImpl;

@Controller
@RequestMapping("/titanic")
public class PassengerController {
	@Autowired
	PassengerServiceImpl passengerService;
	AllPassengers allPassengers;

	
	//Constuctors
	public PassengerController() {
		super();
	}

	public PassengerController(PassengerServiceImpl passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}

	public PassengerController(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;
	}

	
	//Not 100% sure about the following
	@GetMapping("/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View Passenger");
		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);

		return "passenger";

	}

}
