package uk.ac.belfastmet.events.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uk.ac.belfastmet.events.domain.AllEvents;
import uk.ac.belfastmet.events.domain.Event;

@Service
public class EventsService {
	@Value("${https://neueda-flask-bndouglas.c9users.io/belfast-events/api/}")
	private String eventsUrl;
	private RestTemplate restTemplate;
	
	//Constructing
	public EventsService() {
		super();	
	}
	public EventsService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	public EventsService(String eventsUrl) {
		super();
		this.eventsUrl = eventsUrl;
	}
	public EventsService(String eventsUrl, RestTemplate restTemplate) {
		super();
		this.eventsUrl = eventsUrl;
		this.restTemplate = restTemplate;
	}
	
	//All Events
	public ArrayList<Object> allevents(){
		AllEvents allEvents = this.restTemplate.getForObject(this.eventsUrl, AllEvents.class);
		return allEvents.getAllEvents();
		}
}
