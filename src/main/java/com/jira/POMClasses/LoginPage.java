package com.jira.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//input [@name = 'username']"))
	private WebElement username;
	
	@FindBy(xpath = ("//button [@id = 'login-submit']"))
	private WebElement continueBtn;
	
	@FindBy(xpath = ("//input [@name = 'password']"))
	private WebElement password;
	
	@FindBy(xpath = ("//button [@id = 'login-submit']"))
	private WebElement loginBtn;
	
	public void enterUsername()
	{
		username.sendKeys("khandareprajwal00@gmail.com");
	}
	
	public void clickOnContinueBtn()
	{
		continueBtn.click();
	}
	
	public void enterPassword()
	{
		password.sendKeys("8390204421");
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
	
	
	
	
}
