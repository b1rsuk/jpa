package sdsddemo1.repository;


import org.springframework.data.repository.CrudRepository;
import sdsddemo1.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
