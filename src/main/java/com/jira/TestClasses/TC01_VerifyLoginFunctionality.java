package com.jira.TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jira.POMClasses.HomePage;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(hp.createBtn()));
		
//		Thread.sleep(8000);
		
		String expected = "MG8 board - Agile Board - Jira";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
	}
}
