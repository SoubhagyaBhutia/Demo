package com.test;

import java.io.IOException;
import java.net.MalformedURLException;

import com.base.BaseClass;

public class Testclass extends BaseClass{
	public static void main(String[] args) throws MalformedURLException, IOException {
		
	
	 Testclass obj = new Testclass();
	 obj.DriverSsetting("https://demoqa.com/broken");
	 obj.BrokenLinks();

}
}