package uk.ac.belfastmet.sbtest.controller;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
		@Controller
		@RequestMapping
	public class SimpleController {
		@GetMapping("/shrek")
		public String shrek(Model model) {
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
		model.addAttribute("disneyDwarfs", disneyDwarfs);
		model.addAttribute("pageTitle", "SOMEBODY ONCE TOLD ME...");
		return "shrek.html";}
		
		@GetMapping("/rocket")
		public String rocket(Model model) {
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
		model.addAttribute("disneyDwarfs", disneyDwarfs);
		model.addAttribute("pageTitle", "Housten, we have a problem...");
		return "rocket.html";}
	
		
	}