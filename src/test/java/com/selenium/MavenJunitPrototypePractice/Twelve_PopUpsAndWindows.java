package com.selenium.mavenJunitPrototypePractice;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class Twelve_PopUpsAndWindows extends AbstractWebDriver{
	
	
	//This test currently throws an exception
	//org.openqa.selenium.NoAlertPresentException: No alert is present (WARNING: The server did not provide any stacktrace information)
	/*@Test
	public void alertTest(){
		landingPage.navigateToContactPage("contact");
		driver.findElement(By.id("submit_message")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Assert.assertTrue(alert.getText().contains("Name"));
	}*/
	
	@Test
	public void windowTest(){
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("footer_term")).click();
		
		for(String currentWindow : driver.getWindowHandles()){
			driver.switchTo().window(currentWindow);
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
	}	

}
