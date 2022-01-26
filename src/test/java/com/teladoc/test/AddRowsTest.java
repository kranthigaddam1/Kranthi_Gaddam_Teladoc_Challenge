package com.teladoc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddRowsTest extends BaseTest{

	@SuppressWarnings("deprecation")
	@Test
	public void AddRow()
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button")).click();
		driver.findElement(By.name("FirstName")).sendKeys("AAA");
		driver.findElement(By.name("LastName")).sendKeys("BBB");
		driver.findElement(By.name("UserName")).sendKeys("ABC");
		driver.findElement(By.name("Password")).sendKeys("123");
		driver.findElement(By.name("RoleId")).sendKeys("Admin");
		driver.findElement(By.name("Email")).sendKeys("test@test.com");
		driver.findElement(By.name("Mobilephone")).sendKeys("1234567890");
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		WebElement btn=driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]"));
		btn.click();
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		//Validate row is added to the table

		if (driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td[3]")).size() != 0)

		{
			System.out.println("Success - Row has been added to the table");
		}
		else
		{
			System.out.println("Failure - Row has not been added to table");

		}
	}	

}

