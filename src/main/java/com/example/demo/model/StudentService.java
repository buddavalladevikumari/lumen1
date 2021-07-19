package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.data.Studentdata;



@Service
public class StudentService {


   Map<Integer,Studentdata> studentlist =  new HashMap<>();

	public StudentService() {
		super();
		studentlist = new HashMap<>();
		init();
	}
	 
	public void init() {
	studentlist.put(1,new Studentdata(101,"ganesh",878));
	studentlist.put(2,new Studentdata(102,"ra,",9877));
	}
	public Studentdata getbyid(int id) {
		 return this.studentlist.get(id);
		}
	
}
