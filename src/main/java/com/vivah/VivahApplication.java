package com.vivah;

import com.vivah.entity.Person;
import com.vivah.entity.Profile;
import com.vivah.repository.PersonRepository;
import com.vivah.repository.ProfileRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VivahApplication implements CommandLineRunner {

	@Autowired
	 PersonRepository personRepository;
	@Autowired
	 ProfileRepository profileRepository;

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(VivahApplication.class, args);
	}

	@Override
	public void run(String... args){


		Person person = new Person();
		person.setComplexion("fair");


		Profile profile = new Profile();
		profile.setMobileNumber("1234567890");
		profile.setBride(true);
		profile.setPerson(person);

		person.setProfile(profile);

		personRepository.save(person);
		profileRepository.save(profile);

	}

}