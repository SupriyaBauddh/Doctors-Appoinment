package com.assignment.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.database.model.user;
import com.assignment.database.model2.user2;
import com.assignment.database.repo.Repository;
import com.assignment.database.repo2.Repository2;

@RestController
public class Controller {
	
	@Autowired
	private Repository data;
	private Repository2 data2;
	
	//1st api
	@GetMapping("/appointment/{patientname}")
	public List<user2> getappoint(@PathVariable String patientname){
		return data2.findByPatient(patientname);
	}
	
	//2nd api
	@GetMapping("/user/{username}")
	public List<user> getUser(@PathVariable String username){
		return data.findByUser(username);
	}
	
	//get api
	@PostMapping("/user")
	public String saveUser(@RequestBody user User) {
		data.save(User);
		return " Data Saved ";
	}
}
