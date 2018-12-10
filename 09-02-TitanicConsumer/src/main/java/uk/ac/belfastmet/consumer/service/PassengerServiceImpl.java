package uk.ac.belfastmet.consumer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import uk.ac.belfastmet.consumer.domain.AllPassengers;
import uk.ac.belfastmet.consumer.domain.Passenger;

public class PassengerServiceImpl implements PassengerService {
	@Value("${api.passenger.url}")
	private String passengerUrl;
	private RestTemplate restTemplate;
	public PassengerServiceImpl(String passengerUrl, RestTemplate restTemplate) {
		super();
		this.passengerUrl = passengerUrl;
		this.restTemplate = restTemplate;
	}
	public String getPassengerUrl() {
		return passengerUrl;
	}
	public void setPassengerUrl(String passengerUrl) {
		this.passengerUrl = passengerUrl;
	}
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	//public Passenger get(Integer passengerId) {}
	
	public ArrayList<Passenger> list(){
		UriComponentsBuilder getAllPassengersUri = UriComponentsBuilder.fromUriString("http://localhost8090/passengers");
		AllPassengers allPassengers = this.restTemplate.getForObject(getAllPassengersUri.toString(), AllPassengers.class);
		return allPassengers.getAllPassengers();
		}
	
	
	public Passenger add(Passenger passenger, Integer passengerId) {
	return null;}
	public Passenger update(Passenger passenger, Integer passengerId) {
	return null;}
	public void delete(Integer passengerId){}
	
	public Passenger get(Integer PassengerID) {
		UriComponentsBuilder getPassengerUrl = UriComponentsBuilder.fromUriString("http://localhost:8090/passenger/10");
		this.restTemplate.getForObject(getPassengerUrl.toString() , Passenger.class);
		
		return null;
	}
}

