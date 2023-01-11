package com.jira.TestClasses;

import org.testng.annotations.Test;

import com.jira.POMClasses.HomePage;

public class TC03_Verify extends TestBaseClass
{
	@Test
	public void verify()
	{
		HomePage hp = new HomePage(driver);
		
		hp.clickOnCreateBtn();
		System.out.println();
		System.out.println("Clicked on createBtn");
	}
}
