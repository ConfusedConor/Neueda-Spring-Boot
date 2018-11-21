package uk.ac.belfastmet.dwarf.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.service.DwarfService;
	@Controller
	@RequestMapping
public class DisneyController {
	@GetMapping("/disney")
	public String home(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
		// Dwarf mysteryDwarf = disneyDwarf.get(4);
	
		model.addAttribute("disneyDwarfs", disneyDwarfs);
		model.addAttribute("pageTitle", "Disney!");
		return "disney.html";
	
	
	}
	}

