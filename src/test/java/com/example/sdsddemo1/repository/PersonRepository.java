package com.example.sdsddemo1.repository;

import com.example.sdsddemo1.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
