package com.jc.testappium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {

	ExtentSparkReporter htmlReporter;
	ExtentReports extentReports;
	
	@BeforeSuite
	public void reportSetup() {
		htmlReporter = new ExtentSparkReporter("src/main/resources/TestReport.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
	}
	
	@AfterSuite
	public void reportTeardown() {
		extentReports.flush();
	}
	
}
