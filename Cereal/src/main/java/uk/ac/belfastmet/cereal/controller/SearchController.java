package uk.ac.belfastmet.cereal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uk.ac.belfastmet.cereal.repositories.CerealRepository;

@Controller
	@RequestMapping("")
public class SearchController {
	
		CerealRepository cerealRepository;
		
		
	public SearchController(CerealRepository cerealRepository) {
			super();
			this.cerealRepository = cerealRepository;
		}
	@GetMapping("/all")
		
		
		public String all(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAll());
			model.addAttribute("pageTitle", "All Cereals");
			return "cereal";
	}
	@PostMapping("/searchCereal")
	public String searchCereal(@RequestParam("cereal") String cereal, Model model)
	{
		model.addAttribute("cereal", this.cerealRepository.findAllByCerealContaining(cereal));
		model.addAttribute("pageTitle","Search by Cereal!");
		return "cereal";}
	

}
