package sdsddemo1.repository;


import org.springframework.data.repository.CrudRepository;
import sdsddemo1.entity.Passport;

public interface PassportRepository extends CrudRepository<Passport, Long> {
}
