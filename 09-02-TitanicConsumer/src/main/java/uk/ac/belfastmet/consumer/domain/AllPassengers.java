package uk.ac.belfastmet.consumer.domain;

import java.util.ArrayList;
@Data
public class AllPassengers {
private ArrayList<Passenger> allPassengers;

public AllPassengers(ArrayList<Passenger> allPassengers) {
	super();
	this.allPassengers = allPassengers;
}

public ArrayList<Passenger> getAllPassengers() {
	return allPassengers;
}

public void setAllPassengers(ArrayList<Passenger> allPassengers) {
	this.allPassengers = allPassengers;
}
public Passenger getPassengerWithId(Integer passengerId) {

	for (int i=0; i<this.allPassengers.size(); i++) {
	Passenger currentPassenger = this.allPassengers.get(i);
	if(currentPassenger.getPassengerId() == i) {
	return currentPassenger;	
	}
	
	}
	return null;
	}
}
