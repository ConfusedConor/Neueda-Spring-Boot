package uk.ac.belfastmet.cereal.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereal.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer>{

	Iterable<Cereal> findAllByCerealContaining(String cereal);

	Iterable<Cereal> findAllByManufacturer(String string);
}
