package com.StudentManagement.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.StudentManagement.demo.service.StudentService;

@RestController
public class StudentLoginController {
	
	@Autowired
	StudentService studentService;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/StudentLogin/{username}/{email}")
	public Boolean checklogin(@PathVariable("username")  String username ,@PathVariable("email") String email )
	{   Boolean check;
	    String userName=(String)username;
		String firstName= studentService.loginService(email);
		System.out.println(firstName+"           "+username);
		if (userName.equalsIgnoreCase(firstName))
		{check=true ; }
		else
		{check=false;}

		return check;
		}

}
