package com.opencart.testrunner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.opencart.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src\\test\\java\\com\\opencart\\features\\Adactin.feature",
	glue="com.opencart.stepdefinition",tags="@sc"
		 )
public class TestRunner  extends BaseClass{
	@BeforeClass
	
	public static void user_should_launch_the_adactin_hotel_application() {
	   getBrowser("chrome");
	   getUrl("http://adactinhotelapp.com/");
	}
	
//	@AfterClass
//	public static void driverQuit() {
//		driver.quit();
//	}
	
}
