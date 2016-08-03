package com.selenium.propertyManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {

	public String contactFormNameField = "";
	public String contactFormNameValue = "";
	private String phantomJSDriver;
	
	public void generateProperty(){
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = this.getClass().getClassLoader().getResourceAsStream("com/selenium/propertyManager/parameters.properties");
			prop.load(input);
			
			contactFormNameField = prop.get("name_field").toString();
			contactFormNameValue = prop.get("name_value").toString();
			
			setPhantomJSDriver(prop.get("phantomJSDriver").toString());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String getPhantomJSDriver() {
		return phantomJSDriver;
	}

	public void setPhantomJSDriver(String phantomJSDriver) {
		this.phantomJSDriver = phantomJSDriver;
	}
	
}
