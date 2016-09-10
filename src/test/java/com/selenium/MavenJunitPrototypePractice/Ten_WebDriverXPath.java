package com.selenium.mavenJunitPrototypePractice;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.pageObjectZoo.ContactPage;

public class Ten_WebDriverXPath extends AbstractWebDriver{

	
	@Test
	public void xpath(){
		//driver.navigate().to("http://www.thetestroom.com/webapp");
		//ContactPage contactPage = landingPage.navigateToContactPage();
		
		//driver.findElement(By.linkText("CONTACT")).click();
		//driver.findElement(By.xpath("//a[@id='contact_link']")).click();
		//driver.findElement(By.xpath("//a[contains(@id,'contact_link')]")).click();
	
		WebElement element;
		
		//1.  Start from root "head" and return the title innerHTML
		element = driver.findElement(By.xpath("//head/title"));
		Assert.assertTrue("Zoo Adoption | Home".equals(element.getAttribute("innerHTML")));
		
		//2.  Selects all titles and return the title innerHTML
		element = driver.findElement(By.xpath("//title"));
		Assert.assertTrue("Zoo Adoption | Home".equals(element.getAttribute("innerHTML")));
		
		//3.  Return a list of anchor tags and display the last in the list
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		//System.out.println(element.getAttribute("name"));
		Assert.assertTrue("http://www.thetestroom.com/".equals(elements.get(elements.size() - 1).getAttribute("href")));
		
		//4.  Return a specific node with the contains method
		element = driver.findElement(By.xpath("//a[@href = 'http://www.thetestroom.com']"));
		System.out.println(element.getText());
		
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
		
		System.out.println("hello");
	}
	
}
