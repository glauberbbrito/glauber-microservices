package com.glauber.foo.service;

import java.util.List;

import com.glauber.foo.model.Person;

public interface PersonService {

	Person findById(String id);
	
	List<Person> findAll();
	
}
