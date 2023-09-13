package com.cjc.webcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webcrud.Model.Student;
import com.cjc.webcrud.Service.HomeService;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	
	HomeService hs;
	
	@PostMapping("/savestu")
	public String savestu(@RequestBody Student s) {
		
		hs.savestu(s);
		
		return "Student data saved successfully... ";
		
	}
	
	@GetMapping("/getstu")
	public Iterable<Student> getstu(){
		
		
		return hs.getstu();
		
	}
	
	@GetMapping("/getsinglest/{sid}")
	public Student getsinglestu(@PathVariable ("sid") int id) {
		
		
	return	hs.getsinglest(id);
	}
	
	
	@PutMapping("/updatestu")
	public String updatestu(@RequestBody Student st) {
		
		hs.updatest(st);
		
		return "Student data update Successfully....";
	}
	
	
	@DeleteMapping("/deletest/{sid}")
	public String deletestu(@PathVariable ("sid") int id) {
		
		hs.deletestu(id);
		
		return "student data deleted successfully....";
		
	}
}
