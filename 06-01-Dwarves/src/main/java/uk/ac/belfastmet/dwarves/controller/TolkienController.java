package uk.ac.belfastmet.dwarves.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarves.domain.Dwarf;
import uk.ac.belfastmet.dwarves.repository.DwarfRepository;
import uk.ac.belfastmet.dwarves.service.DwarfService;

	@Controller
	@RequestMapping
public class TolkienController {
		DwarfRepository dwarfRepository;
		public TolkienController(DwarfRepository dwarfRepository) {
			super();
			this.dwarfRepository = dwarfRepository;
		}
	@GetMapping("/tolkien")
	public String home(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		//ArrayList<Dwarf> tolkienDwarfs = dwarfService.getTolkienDwarfs();
		//model.addAttribute("tolkienDwarfs", tolkienDwarfs);
		model.addAttribute("disneyDwarfs", this.dwarfRepository.findByAuthor("Tolkien"));
		model.addAttribute("pageTitle", "Tolkien's Dwarves!");
		model.addAttribute("headerTitle", "Dwarves mate, Dwarves...");
		model.addAttribute("subheaderTitle", "Yeah, Tolkiens boys are below!");

		return "dwarfPage.html";
	}
}
