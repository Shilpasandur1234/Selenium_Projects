package com.selenium.basictest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assignment_PageLabel 
{  
	WebDriver w;
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver",".\\WebDriver\\chromedriver.exe");
	  w = new ChromeDriver(); 
  }
  
  @Test(priority = 0, description = "Verify Page Functionality")
  public void Verify_Page() 
  {
	  w.get("https://www.policyx.com/\" in Chrome using TestNG /");

		//String loginPageTitle = w.getTitle();   // for getting title   
		//Assert.assertEquals(loginPageTitle, "India's Most Trusted Insurance Portal");
	    
		//String loginPageTitle1 = w.getTitle();   // for getting title   
		//Assert.assertEquals(loginPageTitle1, "Insurance");
		
	    w.findElement(By.xpath("//*[@id=\"page2\"]/header/div/div[4]/div[4]/a")).click();
	    WebElement loginPageLabel = w.findElement(By.xpath("//*[@id=\"page1\"]/div[2]/div/div/div[1]/h1"));
		String loginPageLabelText = loginPageLabel.getText();
		Assert.assertTrue(loginPageLabelText.contains("CLAIM ASSISTANCE"), "Label is different");
		
		String loginPageTitle2 = w.getTitle();   // for getting title   
		Assert.assertEquals(loginPageTitle2, "Claim Process");
  }
  
  @AfterTest
  public void afterTest()
  {
	  w.close();
  }

}
