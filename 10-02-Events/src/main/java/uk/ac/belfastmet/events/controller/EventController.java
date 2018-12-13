package uk.ac.belfastmet.events.controller;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.AllEvents;

import uk.ac.belfastmet.events.service.EventsService;


@Controller
@RequestMapping
public class EventController {
	EventsService eventsService;
	AllEvents allEvents;
	
	
	
	@GetMapping("")
	public String home() {
		return "index";
	}
	@GetMapping("/events/all")
	public String allEvents(Model model) {
		
//		ArrayList<Event> events = this.eventsService.allevents();
//		Logger logger = LoggerFactory.getLogger(Event.class);
//		logger.info(allEvents.toString());
		model.addAttribute("pageTitle", "All Events");
		
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject("http://neueda-flask-bndouglas.c9users.io/belfast-events/api/", AllEvents.class);
		
		
		model.addAttribute("events", allEvents.getAllEvents());
		return "eventsPage";
	}
	
	//The following Segment just does not work...
	@GetMapping("/event/{identifier}")
	public String oneEvent(@PathVariable("identifier") String identifier, Model model) {
		model.addAttribute("pageTitle", "All Events");
	
	RestTemplate restTemplate = new RestTemplate();
	AllEvents allEvents = restTemplate.getForObject("http://neueda-flask-bndouglas.c9users.io/belfast-events/api/"+identifier, AllEvents.class);
	
	
	model.addAttribute("events", allEvents.getEventWithId(identifier));
	return "eventsPage";
	}
	
	
}
