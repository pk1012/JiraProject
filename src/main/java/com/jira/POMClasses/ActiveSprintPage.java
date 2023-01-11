package com.jira.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveSprintPage 
{
	@SuppressWarnings("unused")
	private WebDriver driver;
	private Actions act;
	
	public ActiveSprintPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
		act = new Actions(driver);
	}
	
	@FindBy (xpath = ("//div [@class = 'ghx-issue ghx-newcard js-detailview js-issue ghx-issue-subtask ghx-not-rankable ghx-selected ghx-type-10003 ghx-narrow-card']"))
	private WebElement developement;
	
	
	
	
}
