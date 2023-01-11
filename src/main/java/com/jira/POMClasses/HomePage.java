package com.jira.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//button [@id = 'createGlobalItem']"))
	private WebElement createBtn;
	
	@FindBy(xpath=("//span [text() = 'Roadmap']"))
	private WebElement roadmap;
	
	@FindBy(xpath=("//span [text() = 'Active sprints']"))
	private WebElement activeSprint;
	
	public void clickOnRoadmap()
	{
		roadmap.click();
	}
	
	public void clickOnActiveSprint()
	{
		activeSprint.click();
	}
	
	public void clickOnCreateBtn()
	{
		createBtn.click();
	}
	
	public WebElement createBtn()
	{
		WebElement createBtn0 = driver.findElement(By.xpath("//button [@id = 'createGlobalItem']"));
		return createBtn0;
	}
	
	
	
	
	
	
}
