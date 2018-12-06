package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import uk.ac.belfastmet.titanic.domain.Passenger;
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
	
	//Edit Function
		@GetMapping("/edit/{passengerId}")
		
		public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model)
		{
			model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
			model.addAttribute("pageTitle","Editing Passenger Records");
			return "editPassenger";}
		
		//Add Function
			@GetMapping("/add/")
			
			public String addPassenger(Model model)
			{
				model.addAttribute("pageTitle", "adding Passenger");
				model.addAttribute("passenger", new Passenger());
				return "editPassenger";}
			
		//Save Function
			@PostMapping("/save")
					
			public String savePassenger(@Valid Passenger passenger,BindingResult bindingResult, Model model,RedirectAttributes redirectattributes)
			{
				if(bindingResult.hasErrors()) {
					return "editPassenger";
				}
				else {
				Passenger savedPassenger= this.passengerRepository.save(passenger);
				//redirectattributes.addFlashAttribute("message", "New Passenger Record Created!");
				return "redirect:/individual/"+passenger.getPassengerId();
				}		
				}
	}
