package com.Mahakaal.databaseTestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Mahakaal.dataBaseTestingReport.DataBaseTestingReport;

public class CheckTableData  {

	      @BeforeTest
	     public void validate_dataBaseConectionSetUp() {
	    	 System.out.println("hello");
	     }
	
	      	@Test(priority = 1)
	    public void check_databasePresent() {
	    	System.out.println("hi");
	    }
	   
	    @Test(priority = 2)
	    public void check_tabeIsPresent() {
	    	
	    }
	 
	    
	    @Test(priority = 3)
	    public void validate_howManyColumn() {
	    	
	    }
	 
	    
	    
	    @Test(priority = 4)
	    public void validate_howManyRow() {
	    	
	    }
	  
	    
	    @Test(priority = 5)
	    public void validate_firstNameValue() {
	    	
	    }
	 
	    
	    
	
}
