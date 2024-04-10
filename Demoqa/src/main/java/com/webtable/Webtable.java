
package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	WebDriver driver;
	public void Driversetting(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void Automatetable() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
//	WebElement tabledata=driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']"));
//String Data	=tabledata.getText();
	//	System.out.print(Data);
		
		WebElement singledata=driver.findElement(By.xpath("//div[text()='Vega']"));
		String singledata1= singledata.getText();
	}

}
