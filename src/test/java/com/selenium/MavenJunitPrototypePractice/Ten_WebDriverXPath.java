package com.selenium.mavenJunitPrototypePractice;

import org.junit.Assert;
import org.junit.Test;

import com.selenium.pageObjectZoo.ContactPage;

public class Ten_WebDriverXPath extends AbstractWebDriver{

	
	@Test
	public void xpath(){
		//driver.navigate().to("http://www.thetestroom.com/webapp");
		//ContactPage contactPage = landingPage.navigateToContactPage();
		
		//driver.findElement(By.linkText("CONTACT")).click();
		//driver.findElement(By.xpath("//a[@id='contact_link']")).click();
		//driver.findElement(By.xpath("//a[contains(@id,'contact_link')]")).click();
		ContactPage contactPage = landingPage.navigateToContactPageUsingXPath();
		
		// --> / Selects from the root node
		//WebElement element = driver.findElement(By.xpath("//link"));
		//System.out.println(element.getAttribute("rel"));
		
		//WebElement element = driver.findElement(By.xpath("//input[@name='email_field']"));
		//element.sendKeys("asdf@gmail.com");
		
		contactPage = contactPage.setNameFieldXPath("asdf@gmail.com");
		
		Assert.assertTrue("asdf@gmail.com".equals(contactPage.getEmailField().getAttribute("value")));
		
		//System.out.println(element.getAttribute("value"));
		
		/////////////////////Assert.assertTrue("asdf@gmail.com".equals(element.getAttribute("value")));
		
		//System.out.println("hello");
	}
	
}
