package com.Test.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class annotationstest {
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Beforesuite");
		
	}
	

@BeforeClass
public void Beforeclass() {
	System.out.println("Beforeclass");
	
}


@BeforeTest
public void Beforetest() {
	System.out.println("Beforetest");
	
}
	@Test
	public void Test(){
	System.out.println("Test");

	}
	



@BeforeMethod
public void Beforemethod() {
System.out.println("Beforemethod");

}



@AfterMethod
public void Aftermethod() {
	System.out.println("Aftermethod");
	
	}

@AfterTest
public void Aftertest() {
	System.out.println("Aftertest");
	
}


@AfterClass
public void Afterclass() {
	System.out.println("Afterclass");
	
}


@AfterSuite
public void Aftersuite() {
	System.out.println("Aftersuite ");
}
}
