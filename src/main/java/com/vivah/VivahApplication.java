package com.vivah;

import com.vivah.entity.Address;
import com.vivah.entity.FamilyMember;
import com.vivah.entity.Person;
import com.vivah.entity.Profile;
import com.vivah.repository.AddressRepository;
import com.vivah.repository.FamilyMemberRepository;
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
	@Autowired
	FamilyMemberRepository familyMemberRepository;
	@Autowired
	AddressRepository addressRepository;

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


		FamilyMember familyMember = new FamilyMember();
		familyMember.setFullName("abc");
		familyMember.setPerson(person);

		FamilyMember familyMember1 = new FamilyMember();
		familyMember1.setFullName("def");
		familyMember1.setPerson(person);

		person.getFamilyMembers().add(familyMember);
		person.getFamilyMembers().add(familyMember1);

		Address address = new Address();
		address.setAddress1("abc");
		address.setState("Nebraska");
		address.setProfile(profile);
		profile.setAddress(address);


		profileRepository.save(profile);


		FamilyMember profile1 = familyMemberRepository.getById(1);
		System.out.println(profile1);

//		personRepository.save(person);
//		familyMemberRepository.save(familyMember1);
//		familyMemberRepository.save(familyMember);


//		profile.setAddress(address);

//		familyMemberRepository.save(familyMember);
//		personRepository.save(person);
//		profileRepository.save(profile);
//		addressRepository.save(address);

//		person.setComplexion("Good");
//		profileRepository.save(profile);
//		personRepository.save(person);

//		address.setState("Iowa");
//		addressRepository.save(address);

//		Profile profile = profileRepository.getById(1);
//		System.out.println(profile.toString());
	}
}