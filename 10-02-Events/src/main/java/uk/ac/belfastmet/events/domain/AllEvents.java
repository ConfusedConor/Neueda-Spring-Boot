package uk.ac.belfastmet.events.domain;

import java.util.ArrayList;;

public class AllEvents {
	
private ArrayList<Event> allEvents;	
	//Constructors
	public AllEvents() {
		super();
	}
	public AllEvents(ArrayList<Event> allEvents) {
		super();
		this.allEvents = allEvents;
	}
	public ArrayList<Event> getAllEvents() {
		return allEvents;
	}

	public Event getEventWithId(String identifier) {
		for (int i=0; i<this.allEvents.size(); i++) {
			Event currentEvent = this.allEvents.get(i);
			if (currentEvent.getIdentifier().equals(identifier) ) {
				return currentEvent;
			}
		}
		return null;
	}
}
