package com.base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	public void DriverSsetting(String url) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
	}
	public void BrokenLinks() throws MalformedURLException, IOException{
		List<WebElement>Links= driver.findElements(By.tagName("a"));
		for(WebElement link: Links) {
			String href= link.getAttribute("href");
			if(href !=null && !href .isEmpty()) {
				HttpURLConnection connection = (HttpURLConnection) new URL(href).openConnection();
				connection.setRequestMethod("HEAD");
				int Responstime= connection.getResponseCode();
				if(Responstime == 200) {
					System.out.println("Links : "+ href+ Responstime);
				}else
					System.out.println("Broken links :" + href + Responstime);
				}
			}
		}

}
