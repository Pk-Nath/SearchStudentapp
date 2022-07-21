package com.searchstudentapp.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.searchstudentapp.dto.Student;

@Component
public class StudentRestclient {

	public Student viewOneStudent(long id) {
		RestTemplate rest=new RestTemplate();
		Student stud = rest.getForObject("http://localhost:8080/student/api/get/"+id, Student.class);
		return stud;
	}

}
