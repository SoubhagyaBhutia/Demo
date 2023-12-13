package Com.Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configure {
	WebDriver driver;
	public void DriverSetting(String url) {
		driver= new ChromeDriver();
		driver.get(url);
		
	}

}
