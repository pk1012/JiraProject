package com.jira.TestClasses;

import org.testng.annotations.Test;

import com.jira.POMClasses.ActiveSprintPage;
import com.jira.POMClasses.HomePage;

public class TC02_VerifyWorkflowDragAndDropFunctionality extends TestBaseClass
{
	@Test 
	public void verifyWorkflowDragAndDropFunctionality()
	{
		HomePage hp = new HomePage(driver);
		
		hp.clickOnRoadmap();
		System.out.println("Clicked on roadmap");
		
		hp.clickOnActiveSprint();
		System.out.println("Clicked on active sprint");
		
		ActiveSprintPage asp = new ActiveSprintPage(driver);
		
		asp.moveToDone();
		System.out.println("moved developement from ToDo to Done");
		
	}
}
