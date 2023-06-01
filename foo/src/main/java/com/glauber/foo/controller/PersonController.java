package com.glauber.foo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glauber.foo.model.Person;
import com.glauber.foo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;

	@GetMapping("/{id}")
	public Person findById(@PathVariable("id") String id){
		return service.findById(id);
	}
	
	@GetMapping()
	public List<Person> findAll(){
		return service.findAll();
	}
	
}

