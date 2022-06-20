package com.AllTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.AllEmployees.AllEmployeesDetails;

public class AllExecutionDetails extends AllEmployeesDetails {
	AllEmployeesDetails s;
	@Test
	public void VerifyGet() throws FileNotFoundException {
		s=new AllEmployeesDetails();
		s.getMethod0();
		}
	@Test(priority=1)
	public void VerifyPost() throws FileNotFoundException {
		s=new AllEmployeesDetails();
		s.createMethod();
	}
	@Test(priority=2)
	public void VerifyPut() throws FileNotFoundException {
		s=new AllEmployeesDetails();
		s.putMethod();
	}
	@Test(priority=3)
	public void VerifyDelete() {
		s=new AllEmployeesDetails();
		s.deleteMethod();
	}
}
