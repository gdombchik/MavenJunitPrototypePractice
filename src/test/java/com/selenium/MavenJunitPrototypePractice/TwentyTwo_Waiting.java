package com.selenium.mavenJunitPrototypePractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.pageObjectZoo.ContactConfirmationPage;
import com.selenium.pageObjectZoo.ContactPage;

public class TwentyTwo_Waiting extends AbstractWebDriver {
	
	@Test
	public void test1(){
		waitUntilWebElementIsAvailable(By.tagName("p"),5);//wait up to max of 5 seconds
		
		ContactPage contactPage = landingPage.navigateToContactPage();
		
		//sleep(5);
				
		contactPage = contactPage.setNameField(propertyManager.getContactFormNameField(),propertyManager.getContactFormNameValue());
		contactPage = contactPage.setAddressField("test address");
		contactPage = contactPage.setEmailField("test email");
		contactPage = contactPage.setPostCodeField("test post code");
		contactPage.submitForm();
		driver.getCurrentUrl().contains("contact_confirm");
	}
	
	//java.lang.Thread to sleep
	public void sleep(int seconds){
		try{
			Thread.sleep(seconds * 1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public WebElement waitUntilWebElementIsAvailable(By locator, int seconds){
		return (new WebDriverWait(driver,seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
