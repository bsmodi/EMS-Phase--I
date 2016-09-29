package com.flp.ems.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {

	public static void validateDate(String date) throws Exception{
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dateOb = format.parse(date);
		if(dateOb.compareTo(new Date()) > 0){
			throw new Exception("Enter valid date");
		}
			
		
	}
	
	
}
