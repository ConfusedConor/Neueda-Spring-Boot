package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;
@Controller
@RequestMapping("")
public class SearchController {
	PassengerRepository passengerRepository;
	public SearchController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
@GetMapping("/all")
	
	
	public String all(Model model) {
		model.addAttribute("passenger", this.passengerRepository.findAll());
		model.addAttribute("pageTitle", "All Passengers Aboard the H.M.S. Titanic");
		return "passengerPage";
}
@PostMapping("/searchName")
public String searchName(@RequestParam("name") String name, Model model)
{
	model.addAttribute("passenger", this.passengerRepository.findAllByNameContaining(name));
	model.addAttribute("pageTitle","Search by Name!");
	return "passengerPage";}
}

