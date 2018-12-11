package uk.ac.belfastmet.consumer.service;



import java.util.ArrayList;

import uk.ac.belfastmet.consumer.domain.Passenger;

public interface PassengerService {

	public Passenger get(Integer passengerId);
	public ArrayList<Passenger> list();
	public Passenger add(Passenger passenger);
	public Passenger update(Passenger passenger);
	public void delete(Integer passengerId);
}
