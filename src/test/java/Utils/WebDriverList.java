package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public enum WebDriverList {
	FirefoxDriver("FirefoxDriver"),HtmlUnitDriver("HtmlUnitDriver"),ChromeDriver("ChromeDriver");
	
	private String driverDescription;
	
	WebDriverList(String description){
		this.driverDescription = description;
	}
	
	public String driverDescription(){
		return driverDescription;
	}

	public WebDriver driverType(){
		switch(this){
			case FirefoxDriver:
				return new FirefoxDriver();
			case HtmlUnitDriver:
				return new HtmlUnitDriver();
			case ChromeDriver:
				return new ChromeDriver();
			default:
				return new FirefoxDriver();
		}
	}
}
