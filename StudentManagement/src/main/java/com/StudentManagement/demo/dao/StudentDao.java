package com.StudentManagement.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentManagement.demo.entity.StudentEntity;
import com.StudentManagement.demo.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository studentRepo;
	
	public List<StudentEntity> get()
	{
		return studentRepo.findAll();
	}
	
	public StudentEntity save(StudentEntity student)
	{
		return studentRepo.save(student);
		
	}
	
	public void delete(int id) {
		studentRepo.deleteById(id);
	}
	
	public  Optional<StudentEntity> find(int id)
	
	{
		return studentRepo.findById(id);
	}
	
	public String loginStudent(String email)
	{
		return studentRepo.checkStudentLogin(email);
	}
}
