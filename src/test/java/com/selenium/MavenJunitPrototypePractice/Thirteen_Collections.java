package com.selenium.mavenJunitPrototypePractice;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class Thirteen_Collections extends AbstractWebDriver{


	@Test
	public void collections(){
		//System.out.println(driver.getTitle());
		
		List<WebElement> linkWebElements = driver.findElements(By.tagName("a"));
		for(WebElement link : linkWebElements){
			//System.out.println(link.getText());
			if(link.getText().equals("CONTACT")){
				link.click();
				break;
			}
		}
		
		List<WebElement> tagWebElements = driver.findElements(By.tagName("input"));
		for(WebElement input : tagWebElements){
			//System.out.println(input.getText());
			if(input.getAttribute("name").equals("name_field")){
				driver.findElement(By.name("name_field")).sendKeys("test value");
				Assert.assertTrue(driver.findElement(By.name("name_field")).getAttribute("value").equals("test value"));
			}
		}
	}
	
}
