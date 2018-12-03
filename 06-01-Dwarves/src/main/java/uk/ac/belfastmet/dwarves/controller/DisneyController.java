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
public class DisneyController {
	DwarfRepository dwarfRepository;
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	@GetMapping("/disney")
	
	
	public String home(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		//ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
		//model.addAttribute("disneyDwarfs", disneyDwarfs);
		model.addAttribute("disneyDwarfs", this.dwarfRepository.findByAuthor("Walt Disney"));
		model.addAttribute("pageTitle", "Disney!");
		model.addAttribute("headerTitle", "Stick a dwarf in here!");
		model.addAttribute("subheaderTitle", "Walts 7 are down there!");

		return "dwarfPage.html";
	
	
	}
	}

