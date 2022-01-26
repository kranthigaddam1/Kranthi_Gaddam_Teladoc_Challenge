package com.teladoc.test;

import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	protected WebDriver driver ;

	@BeforeSuite(alwaysRun = true)
	public void init()
	{	
		System.out.println(Paths.get(System.getProperty("user.dir"), "lib","chromedriver.exe").toString());
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir"), "lib","chromedriver.exe").toString());
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void end()
	{	
		driver.close();
		System.out.println("Closing Chrome browser");
	}
}
