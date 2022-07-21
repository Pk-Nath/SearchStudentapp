package com.searchstudentapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchstudentapp.dto.Student;

@Controller
public class SearchStudentController {

	@Autowired
	private StudentRestclient client;
	
	@RequestMapping("/search")
	public String viewSearchPage() {
		
		return "student_search";
	}
	
	@RequestMapping("/viewStudent")
	public String SearchOnestudent(@RequestParam("id") long id,ModelMap model) {
		Student stud=new Student();
	    stud=client.viewOneStudent(id);
		model.addAttribute("stud", stud);
		return "Student_info";
		
	}
}
