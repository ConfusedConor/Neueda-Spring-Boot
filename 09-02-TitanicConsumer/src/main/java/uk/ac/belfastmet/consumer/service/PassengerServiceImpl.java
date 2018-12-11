package uk.ac.belfastmet.consumer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.consumer.domain.AllPassengers;
import uk.ac.belfastmet.consumer.domain.Passenger;
@Service
public class PassengerServiceImpl implements PassengerService {
	@Value("${api.passenger.url}")
	private String apiUrl;
	private RestTemplate restTemplate;
	
	//Constructor
	public PassengerServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public ArrayList<Passenger> list(){
		String listPassengerUrl= this.apiUrl +"/passengers";
		AllPassengers allPassengers = this.restTemplate.getForObject(listPassengerUrl, AllPassengers.class);
		return allPassengers.getAllPassengers();
		}
	
	
	//Get
	public Passenger get(Integer passengerId) {
		String getPassengerUrl = this.apiUrl + "/passengers/" + passengerId;
		Passenger passenger =this.restTemplate.getForObject(getPassengerUrl, Passenger.class);
		return passenger;
	}
	
	//add
	@Override
	public Passenger add(Passenger passenger) {
		String addPassengerURL = this.apiUrl + "/passengers/" + passenger.getPassengerId();
		this.restTemplate.postForObject(addPassengerURL, passenger, Passenger.class);
		return passenger;
	}
	
	//update
	@Override
	public Passenger update(Passenger passenger) {
		String updatePassengerURL = this.apiUrl + "/passengers/" + passenger.getPassengerId();
		this.restTemplate.put(updatePassengerURL, passenger, Passenger.class);
		return passenger;
	}

	public void delete(Integer passengerId){
			String deletePassengerURL = this.apiUrl + "/passengers/" + passengerId;
			this.restTemplate.delete(deletePassengerURL);
	}
	
	
}

