package com.cucumber.MavenJunitPrototypePractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Utils.WebDriverList;

public abstract class AbstractPageStepDefinition {
	protected static WebDriver webdriver;
	private WebDriver driver;

	public WebDriver getWebdriver() {
		//web driver is null or webdriver.quit (not webdriver.close)
		//if(webdriver==null){ //|| webdriver.equals(EnumDriver.HtmlUnitDriver.driverType())){ //|| ((RemoteWebDriver)webdriver).getSessionId() == null){
		if(webdriver==null || ((RemoteWebDriver)webdriver).getSessionId() == null){
			webdriver = WebDriverList.FirefoxDriver.driverType();
		}
		return webdriver;
	}
}
