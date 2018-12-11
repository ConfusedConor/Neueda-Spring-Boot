package uk.ac.belfastmet.consumer.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.consumer.domain.AllPassengers;
import uk.ac.belfastmet.consumer.domain.Passenger;
import uk.ac.belfastmet.consumer.service.PassengerServiceImpl;

@Controller
@RequestMapping("/titanic")
public class PassengerController {
	@Autowired
	PassengerServiceImpl passengerService;
	AllPassengers allPassengers;

	// Constuctors
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

	// Viewing All Passengers
	@GetMapping("/passengers")
	public String allPassengers(Model model) {
		ArrayList<Passenger> passenger = this.passengerService.list();
		model.addAttribute("pageTitle", "All Passengers");
		model.addAttribute("passenger", passenger);
		return "passengers";
	}

	// Viewing One Passenger
	@GetMapping("/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View Passenger");
		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);

		return "passenger";

	}

	// Editing One passenger
	@GetMapping("passengers/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("pageTitle", "Edit A Record");
		model.addAttribute("passenger", this.passengerService.update(passenger));
		return "editpassenger";
	}

	// Adding one Passenger
	@GetMapping("/passengers/add/")
	public String addPassenger(Model model) {
		model.addAttribute("pageTitle", "Add Passenger");
		
		Passenger passenger = new Passenger();
		model.addAttribute("passenger", passenger);
		return "editpassenger";
	}

	@PostMapping("/passengers/save")
	public String save(Passenger passenger, @RequestParam("addUpdate") String addUpdate, Model model) {
	if(addUpdate.equals("Add Passenger")) {
		this.passengerService.add(passenger);
		return "redirect:/titanic";
	}
	else {
		this.passengerService.update(passenger);
		return "redirect:/titanic/view/" + passenger.getPassengerId();
	}
	}
}
