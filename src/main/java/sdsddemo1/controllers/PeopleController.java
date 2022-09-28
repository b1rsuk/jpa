package sdsddemo1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdsddemo1.entity.Passport;
import sdsddemo1.entity.Person;
import sdsddemo1.repository.PassportRepository;
import sdsddemo1.repository.PersonRepository;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PassportRepository passportRepository;

    @GetMapping("/person")
    public String person() {
        Person a = new Person();
        Passport pass = new Passport();
        a.setName("borsuk");

        personRepository.save(a);
        return "";
    }
}
