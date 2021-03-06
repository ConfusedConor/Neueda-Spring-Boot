package uk.ac.BelfastMet.SBcontroller.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystory")
public class ToyStory {
	@GetMapping("/woody")
	public String woody(Model model) {return "Woody was played by Tom Hanks.";}
	@GetMapping("/buzz")
	public String buzz(Model model) {return "Buzz Lightyear was played by Tim Allen.";}
	@GetMapping("/slinky")
	public String slinky(Model model) {return "Slinky was played by Jim Varney.";}
	@GetMapping("/hamm")
	public String hamm(Model model) {return "Hamm was played by John Ratzenberger.";}
	@GetMapping("/rex")
	public String rex(Model model) {return "Rex was played by Shawn Wallace.";}
	@GetMapping("/potato")
	public String potato(Model model) {return "Mr Potato Head was played by Don Rickles.";}
	@GetMapping("")
	public String toystory(Model model) {return "You know whats gonna be here...";}
}
