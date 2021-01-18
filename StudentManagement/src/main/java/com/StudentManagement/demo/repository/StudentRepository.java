package com.StudentManagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.StudentManagement.demo.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

	
	@Query(value="select first_name from student where email = :email", nativeQuery=true)
	public String checkStudentLogin(@Param("email") String email);
	
	
}
