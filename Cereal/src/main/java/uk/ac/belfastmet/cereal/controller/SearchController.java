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
	//All cereals
	@GetMapping("/all")
		public String all(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAll());
			model.addAttribute("pageTitle", "All Cereals");
			return "cereal";
	}
	//Search
	@PostMapping("/searchCereal")
	public String searchCereal(@RequestParam("cereal") String cereal, Model model)
	{
		model.addAttribute("cereal", this.cerealRepository.findAllByCerealContaining(cereal));
		model.addAttribute("pageTitle","Search by Cereal!");
		return "cereal";}
	
	//Kellogs
	@GetMapping("/kellogs")
	public String kellogs(Model model) {
		model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Kellogg's"));
		model.addAttribute("pageTitle", "Kellogg's Cereals");
		return "cereal";
	}
	//Nestle
		@GetMapping("/nestle")
		public String nestle(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Nestle"));
			model.addAttribute("pageTitle", "Nesle's Cereals");
			return "cereal";
		}

	//Sainsburys
		@GetMapping("/sainsburys")
		public String sainsburys(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Sainsbury's"));
			model.addAttribute("pageTitle", "Sainsbury's Cereals");
			return "cereal";
		}
	//Weetabix
		@GetMapping("/weetabix")
		public String weetabix(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Weetabix"));
			model.addAttribute("pageTitle", "Weetabix's Cereals");
			return "cereal";
		}
	//Honey Monster Foods
		@GetMapping("/honeyM")
		public String honeyM(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Honey Monster Foods"));
			model.addAttribute("pageTitle", "Honey Monster Foods' Cereals");
			return "cereal";
		}
	//Quaker
		@GetMapping("/quaker")
		public String quaker(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Quaker"));
			model.addAttribute("pageTitle", "Quaker's Cereals");
			return "cereal";
		}
		
	//Tesco
		@GetMapping("/tesco")
		public String tesco(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Tesco"));
			model.addAttribute("pageTitle", "Tesco's Cereals");
			return "cereal";
		}
	//Jordans
		@GetMapping("/jordans")
		public String jordans(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Jordans"));
			model.addAttribute("pageTitle", "Honey Monster Foods' Cereals");
			return "cereal";
		}
	//Asda
		@GetMapping("/asda")
		public String asda(Model model) {
			model.addAttribute("cereal", this.cerealRepository.findAllByManufacturer("Asda"));
			model.addAttribute("pageTitle", "Honey Monster Foods' Cereals");
			return "cereal";
		}
}