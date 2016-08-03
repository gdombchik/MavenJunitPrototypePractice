package com.selenium.mavenJunitPrototypePractice;

import org.junit.Assert;
import org.junit.Test;

public class Fifteen_PageFactory extends AbstractWebDriver {
	
	@Test
	public void pageFacgtory(){
		Assert.assertTrue(driver.getTitle().equals("Zoo Adoption | Home"));
	}
}
