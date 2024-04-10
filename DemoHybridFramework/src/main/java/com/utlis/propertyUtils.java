package com.utlis;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyUtils {
	public static String readProperties(String key) throws Exception {
		String path= System.getProperty("user.dir")+"/src/main/resources/properties.file";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	
}
