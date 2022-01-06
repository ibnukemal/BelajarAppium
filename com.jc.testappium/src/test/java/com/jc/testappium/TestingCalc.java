package com.jc.testappium;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.jc.testappium.utils.TestCases;
import com.jc.testappium.utils.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestingCalc extends Reporting{

	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void openCalculator() throws Exception{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// dari CLI
		capabilities.setCapability("deviceName", "Pixel_2_API_24_2");
		capabilities.setCapability("uuid", "emulator-5554");
		capabilities.setCapability("platform", "Android");	
		capabilities.setCapability("platformVersion", "7.0");
		//dari app Info
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, capabilities);
		
		System.out.println("Appium Testing Started...");
		
		
	}
		
	@Test
	public void tes1Tambah() {
		
		ExtentTest test1 = extentReports.createTest("Step1", "Fungsi Tambah");
		test1.log(Status.INFO, "Step 1: Test Fungsi Tambah");
		
		MobileElement satu = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		satu.click();
		MobileElement tambah = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		tambah.click();
		MobileElement dua = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		dua.click();
		MobileElement samadengan = driver.findElement(By.id("com.android.calculator2:id/eq"));
		samadengan.click();
		MobileElement txtResult = driver.findElement(By.id("com.android.calculator2:id/result"));
		txtResult.getText();
		
		test1.log(Status.PASS, "Fungsi Tambah Berhasil");
		
	}
	
	@Test
	public void tes2Perkalian() {
		
		ExtentTest test2 = extentReports.createTest("Step2", "Fungsi Perkalian");
		test2.log(Status.INFO, "Step 2: Test Fungsi Perkalian");
		
		MobileElement tiga = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		tiga.click();
		MobileElement kali = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
		kali.click();
		MobileElement empat = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
		empat.click();
		MobileElement samadengan2 = driver.findElement(By.id("com.android.calculator2:id/eq"));
		samadengan2.click();
		MobileElement txtResult = driver.findElement(By.id("com.android.calculator2:id/result"));
		txtResult.getText();
		
		test2.log(Status.PASS, "Fungsi Perkalian Berhasil");
		
	}
}
