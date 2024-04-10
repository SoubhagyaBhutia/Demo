package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utlis.propertyUtils;

public class Baseclass {
	
	public static ExtentReports report= null;
	public static ExtentSparkReporter spark= null;
	public static ExtentTest test= null;
	
	public static WebDriver driver= null;
	public static void Initialization() throws Exception{

		String BrowserName=propertyUtils.readProperties("browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
			driver= new ChromeDriver();

		}
		if(BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:/geckodriver.exe");
			driver= new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation(selenium%20tools)/Offline%20Website/index.html");
	}
	public static void reportIniIt() {
		report= new ExtentReports();
		spark= new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReport.html");
		report.attachReporter(spark);
		
	}
	
	}
