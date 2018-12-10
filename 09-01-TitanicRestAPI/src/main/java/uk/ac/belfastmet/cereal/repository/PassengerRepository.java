package uk.ac.belfastmet.cereal.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereal.domain.Passenger;

public interface PassengerRepository  extends CrudRepository<Passenger, Integer>{

}
