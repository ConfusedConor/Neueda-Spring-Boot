package uk.ac.belfastmet.cereal.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.cereal.domain.Cereal;
import uk.ac.belfastmet.cereal.repositories.CerealRepository;

@Controller
@RequestMapping("")
public class CrudController {
	CerealRepository cerealRepository;
	//Constructor
	public CrudController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;}
	//View individual Cereal
	@GetMapping("/view/{cerealId}")
	public String viewCereal(@PathVariable("cerealId") Integer cerealId, Model model)
	{
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		model.addAttribute("pageTitle","Individual Cereal");
		return "detailed";
	}
	
	
	//Delete Function
	@GetMapping("/delete/{cerealId}")
	public String deleteCereal(@PathVariable("cerealId") Integer cerealId, Model model, RedirectAttributes redirectattributes)
	{this.cerealRepository.deleteById(cerealId);
	redirectattributes.addFlashAttribute("message", "This cereal nutrition has been removed. Thank you for updating our records.");
	return "redirect:/all";
	}
	
	//Edit Function
		@GetMapping("/edit/{cerealId}")
		
		public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model)
		{
			model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
			model.addAttribute("pageTitle","Editing Cereal Nutrition");
			return "editCereal";}
		
		//Add Function
			@GetMapping("/add/")
			
			public String addCereal(Model model)
			{
				model.addAttribute("pageTitle", "Adding Cereal");
				model.addAttribute("cereal", new Cereal());
				return "editCereal";}
			
		//Save Function
			@PostMapping("/save")
					
			public String saveCereal(@Valid Cereal cereal,BindingResult bindingResult, Model model,RedirectAttributes redirectattributes)
			{
				if(bindingResult.hasErrors()) {
					return "editCereal";
				}
				else {
				Cereal savedCereal = this.cerealRepository.save(cereal);
				return "redirect:/view/"+savedCereal.getCerealId();
				}		
				}
	}
