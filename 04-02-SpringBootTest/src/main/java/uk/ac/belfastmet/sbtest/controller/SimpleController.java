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
		model.addAttribute("LocationFrame", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d224378.83484890635!2d-80.74951446676968!3d28.512075777411198!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88e74b95a365c6fd%3A0x8b7339f246f869dd!2sKennedy+Space+Center!5e0!3m2!1sen!2suk!4v1542902996444\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		return "rockets.html";}
	
		@GetMapping("/")
		public String home(Model model) {
			model.addAttribute("pageTitle", "Welcome to the most pointless page not on the internet.");
			return "index.html";}
		}
		
	