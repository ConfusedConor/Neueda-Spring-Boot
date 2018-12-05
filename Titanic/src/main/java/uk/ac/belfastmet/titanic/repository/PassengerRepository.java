package uk.ac.belfastmet.titanic.repository;
import org.springframework.data.repository.CrudRepository;
import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findByName(String name);

	Iterable<Passenger> findByNameContaining(String name);
	
	Iterable<Passenger>findAllByNameContaining(String name);

	Passenger findByPassengerId(Integer passengerId);


}
