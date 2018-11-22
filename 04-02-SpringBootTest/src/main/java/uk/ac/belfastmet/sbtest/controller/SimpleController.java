package uk.ac.belfastmet.sbtest.controller;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.sbtest.domain.Rocket;
import uk.ac.belfastmet.sbtest.domain.Shrek;
import uk.ac.belfastmet.sbtest.service.SRService;
		@Controller
		@RequestMapping
	public class SimpleController {
		@GetMapping("/shrek")
		public String shrek(Model model) {
		SRService shrekService = new SRService();
		ArrayList<Shrek> shreks= shrekService.getShrekChars();
		model.addAttribute("shreks", shreks);
		model.addAttribute("pageTitle", "SOMEBODY ONCE TOLD ME...");
		return "shrek.html";}
		
		@GetMapping("/rockets")
		public String rockets(Model model) {
		SRService rocketService = new SRService();
		ArrayList<Rocket> rockets = rocketService.getRockets();
		model.addAttribute("rockets", rockets);
		model.addAttribute("pageTitle", "Housten, we have a problem...");
		return "rockets.html";}
	
		@GetMapping("/")
		public String home(Model model) {
			model.addAttribute("pageTitle", "Welcome to the most pointless page not on the internet.");
			return "index.html";}
		}
		
	