package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	WebDriver driver;
	public void DriverSetting(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void Textbox() {
		
		driver.findElement(By.xpath("(//span[@class='text'])[1]")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(");
		driver.findElement(By.id("userName")).sendKeys("nitu");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nitu@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Dhanori");
		driver.findElement(By.id("permanentAddress")).sendKeys("Dhanori");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("submit")).click();
	}
	public void Checkbox() {
		driver.findElement(By.xpath("(//span[@class='text'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("//button[@title='Toggle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
	}
	public void Rediobutton() {
		driver.findElement(By.xpath("(//span[@class='text'])[3]")).click();
		
	}
	
	

}
