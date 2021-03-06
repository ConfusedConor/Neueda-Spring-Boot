package uk.ac.belfastmet.dwarves.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarves.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {
Iterable<Dwarf>findByAuthor(String author);

Dwarf findByDwarfId(Integer dwarfId);

Object findByName(String name);

Object findByNameAndAuthor(String name, String author);
}
