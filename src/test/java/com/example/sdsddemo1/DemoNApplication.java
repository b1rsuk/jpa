package com.example.sdsddemo1;


import com.example.sdsddemo1.entity.Passport;
import com.example.sdsddemo1.entity.Person;
import com.example.sdsddemo1.repository.PassportRepository;
import com.example.sdsddemo1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoNApplication implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository;

	@Autowired
	PassportRepository passportRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoNApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Person a = new Person();
		Passport pass = new Passport();
		a.setName("borsuk");
		a.setPassport(pass);
		personRepository.save(a);
	}
}
