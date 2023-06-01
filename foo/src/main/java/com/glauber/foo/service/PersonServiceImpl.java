package com.glauber.foo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.glauber.foo.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = Person.builder()
							  .id(counter.incrementAndGet())
							  .firstName("Gláuber")
							  .lastName("Brito")
							  .address("Patos - Paraíba - Brasil")
							  .gender("Male")
							  .build();
		return person ;
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<Person>();
		
		for (int i = 0; i < 8; i++) {
			persons.add(mockPerson(i));
		}
		
		return persons;
	}
	
	private Person mockPerson(int i) {
		Person person = Person.builder()
				  .id(counter.incrementAndGet())
				  .firstName("Person name "+i)
				  .lastName("Last name "+i)
				  .address("Some address in Brasil "+i)
				  .gender("Male")
				  .build();
		return person;
	}
}
