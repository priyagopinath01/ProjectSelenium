package com.opencart.testrunner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.opencart.baseclass.BaseClass;
import com.utils.CucumberJVMReport;
import com.utils.LoadProp;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
				"json:src\\test\\resource\\com\\reports\\cucumber-report1.json",
			"junit:src\\test\\resource\\com\\reports\\cucumber-report1.xml",
			"html:src\\test\\resource\\com\\reports\\cucumber-report.html"
		},
		
	features="src\\test\\java\\com\\opencart\\features\\Adactin.feature",
	glue="com.opencart.stepdefinition",tags="@sc and not @ignore"
		 )
public class TestRunner  extends BaseClass{
	public static WebDriver driver;
	
@BeforeClass
public static  void browserLaunchApplication() throws Exception {
	try {
		LoadProp lp=new LoadProp();
			driver=getBrowser(lp.getBrowserName());
		getUrl(lp.getUrl());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception();
	}
}

@AfterClass
public static void driverQuit() {
	driver.quit();
	CucumberJVMReport.getReport();
	}
} 
