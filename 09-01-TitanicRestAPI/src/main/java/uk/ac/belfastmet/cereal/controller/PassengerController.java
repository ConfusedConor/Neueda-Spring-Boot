package uk.ac.belfastmet.cereal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.cereal.domain.Passenger;
import uk.ac.belfastmet.cereal.repository.PassengerRepository;

@RestController
@RequestMapping
public class PassengerController {
	@Autowired
	PassengerRepository passengerRepository;
public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}


@GetMapping("passengers")
public Map<String, Object> getAllPassengers(){
	Map<String, Object> passengerMap = new HashMap<String, Object>();
	passengerMap.put("allPassengers", this.passengerRepository.findAll());
	return passengerMap;
}

//public Iterable<Passenger> getAllPassengers() {
//	return this.passengerRepository.findAll();	
//}
@GetMapping("passengers/{passengerId}")
public Passenger getPassengers(@PathVariable("passengerId") Integer passengerId) {
	return this.passengerRepository.findByPassengerId(passengerId);
}


@PutMapping("passengers/{passengerId}")
public Passenger updatePassenger(@PathVariable("passengerId") Integer passengerId, @RequestBody Passenger passenger )	{
return this.passengerRepository.save(passenger);	
}

//Not Working
@DeleteMapping("passengers/{passengerId}")
public String deletePassengers(@PathVariable("passengerId") Integer passengerId) {
	this.passengerRepository.deleteById(passengerId);
	return "{\"Delete\" : \"Success\", \"Record\": "+ passengerId + "}";
}

@PostMapping("passengers")
public Passenger addPassengers(@RequestBody Passenger passenger) {
	 return this.passengerRepository.save(passenger);
}
}
