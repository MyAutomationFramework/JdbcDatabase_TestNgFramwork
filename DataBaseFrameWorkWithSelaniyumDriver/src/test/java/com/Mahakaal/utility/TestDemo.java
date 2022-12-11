package com.Mahakaal.utility;

import org.testng.annotations.Test;

public class TestDemo {

	 @Test
	     public void test() {
		 // config ---url
		    String saveUrl  =PropertyReader.getConfigProperty("url");
		       System.out.println("url"+saveUrl);
		       
		           String      saveFirstName         = PropertyReader.getDataProperty("First_Name");
		           System.out.println("Firstname is"+saveFirstName);
		           
		                 String          databasePAssword       =PropertyReader.getDataBaseCon("DB_PASSWORD");
		                                   System.out.println("password is "+databasePAssword);
		                                   
		                                   
		                                   String          dbHost       =PropertyReader.getDataBaseCon("DB_HOST");
		                                   System.out.println("host "+dbHost);       
		                                   
	    	 
	     }
	
		

	}


