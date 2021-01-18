package com.StudentManagement.demo.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.StudentManagement.demo.entity.StudentEntity;
import com.StudentManagement.demo.model.Response;
import com.StudentManagement.demo.service.StudentService;
import com.StudentManagement.demo.exception.RecordNotFoundException;

@RestController

public class StudentController {

	@Autowired
	StudentService studentService;
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/home")
	public String hello ()
	{
		return "HELLO WELCOME TO STUDENT MANAGEMENT SYSTEM";
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping(value="/getstudent")
	public List<StudentEntity> getStudent() throws RecordNotFoundException
	{
		//return ResponseEntity.status(HttpStatus.OK).body( new Response(studentService.get() , new Date(0)));
		return studentService.get();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/register")
	public String save(@RequestBody StudentEntity student) throws RecordNotFoundException
	{
		//return ResponseEntity.status(HttpStatus.OK).body( new Response(studentService.save(student) , new Date(0)));
		studentService.save(student) ;
		return "Hi" +" "+student.getFirstName()+ " "+ "registered successfully";
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(value="/update")
	public List<StudentEntity> update(@RequestBody StudentEntity student) throws RecordNotFoundException
	{
	//	return ResponseEntity.status(HttpStatus.OK).body(new Response(studentService.save(student), new Date(0)));
		studentService.save(student);
		return studentService.get();
		}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/find/{id}")
	public Optional<StudentEntity> find(@PathVariable("id") int id) throws RecordNotFoundException
	{
       return  studentService.find(id);
	//	return studentService.get();
	
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(value="/delete/{id}")
	public List<StudentEntity> delete(@PathVariable("id") int id) throws RecordNotFoundException
	{
		studentService.delete(id);
		return studentService.get();
	
}
}