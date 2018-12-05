package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class CrudController {
	PassengerRepository passengerRepository;
	//Constructor
	public CrudController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;}
	//View individual Passenger
	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		model.addAttribute("pageTitle","Individual Passenger Record");
		return "individual";
	}
	
	
	//Delete Function
	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectattributes)
	{this.passengerRepository.deleteById(passengerId);
	redirectattributes.addFlashAttribute("message", "This passenger record has been removed. Thank you for updating our records.");
	return "redirect:/all";
	}
	}
