package com.StudentManagement.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagement.demo.dao.StudentDao;
import com.StudentManagement.demo.entity.StudentEntity;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public List<StudentEntity> get()
	{
		return studentDao.get();
	}
	
	public StudentEntity save(StudentEntity student)
	{
	    return studentDao.save(student);
	 }
	
	public void delete (int id )
	{
		studentDao.delete(id);
	}
	
	public Optional<StudentEntity> find(int id )
	{
		return studentDao.find(id);
	}
	
	public String loginService(String email)
	{
		return studentDao.loginStudent(email);
	}
}

