package uk.ac.belfastmet.translink.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import uk.ac.belfastmet.translink.domain.StationBoardAPI;

@Controller
@RequestMapping
public class TrainController {

	
	@GetMapping("/all")
	public String allServices(Model model) {
		
		String translinkUrl = "https://neueda-flask-bndouglas.c9users.io/translink/api/station/3042A0";
		
		RestTemplate restTemplate = new RestTemplate();
		StationBoardAPI stationBoardAPI = restTemplate.getForObject(translinkUrl, StationBoardAPI.class);
		
		Logger logger = LoggerFactory.getLogger(StationBoardAPI.class);
		logger.info(stationBoardAPI.toString());
		model.addAttribute("pageTitle", "All Trains");
		return "index";
	}
}
