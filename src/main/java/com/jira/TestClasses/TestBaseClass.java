package com.jira.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.jira.POMClasses.LoginPage;

public class TestBaseClass 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeClass
	public void berforeClass(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./DriverFolder/chromedriver.exe");
			
			driver = new ChromeDriver();
			System.out.println("Browser is opened");
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./DriverFolder/geckodriver.exe");
			
			driver = new FirefoxDriver();
			System.out.println("Browser is opened");
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "./DriverFolder/msedgedriver.exe");
			
			driver = new EdgeDriver();
			System.out.println("Browser is opened");		
		}

		driver.manage().window().maximize();
		System.out.println("Maximised browser");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://vsvsvsvs.atlassian.net/jira/software/c/projects/MG8/boards/1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername();
		System.out.println("Entered username");
		
		lp.clickOnContinueBtn();
		System.out.println("Clicked on continue btn");
		
		lp.enterPassword();
		System.out.println("Entered password");
		
		lp.clickOnLoginBtn();
		System.out.println("Clicked on login btn");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Write logout code
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
		System.out.println("Closed browser");
	}
}
