package com.StudentManagement.demo.model;

import java.sql.Date;
import lombok.Data;

//response model class responsible for displaying the API response in an organized format
@Data
public class Response {
	
	private Object data;
	private Date date;
	
	public Response(Object data , Date date)
	{
		super();
		this.data=data;
		this.data=date;
		
	}

}
