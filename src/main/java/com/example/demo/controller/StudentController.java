package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Studentdata;
import com.example.demo.model.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	  private StudentService service;

	@GetMapping(path ="/students/{id}")
	public Studentdata getById(@PathVariable("id") int id){
		return this.service.getbyid(id);
	}

}
