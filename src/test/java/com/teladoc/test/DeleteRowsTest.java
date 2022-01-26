package com.teladoc.test;

//import needed libraries
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteRowsTest extends BaseTest{
	@Test

	public void DeleteRow()

	{

		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[11]/button/i")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();


		//Validate row is deleted from the table

		List<WebElement> wl = driver.findElements(By.xpath("/html/body/table"));

		for(int i=0; i<wl.size(); i++) {
			WebElement current = wl.get(i);

			if(current.getText().contains("ABC")) {
				System.out.println("Failure - Row has not been deleted from the table");
			}  else {
				System.out.println("Success - Row has been deleted from the table");
			}

		}

	}


}

