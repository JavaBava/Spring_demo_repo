package com.StudentManagement.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name="student")
@Data
public class StudentEntity implements Serializable{

	private static final long serialVersionUID = 1681261145191719508L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
}


//create table student (id integer not null auto_increment, email varchar(255),
//first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB

