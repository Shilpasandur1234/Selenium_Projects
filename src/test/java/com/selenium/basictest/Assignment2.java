package com.selenium.basictest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assignment2 
{  
	WebDriver w;
	
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver",".\\WebDriver\\chromedriver.exe");
	  w = new ChromeDriver();
  }

  @Test(priority = 0, description = "Verify Page Functionality")
  public void Bokking() 
  {
	  w.get("https://www.zoopla.co.uk/");
	  
	  String loginPageTitle = w.getTitle();   // for getting title   
	  Assert.assertEquals(loginPageTitle, "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
	  
	  String loginPageURL = w.getCurrentUrl();
	  Assert.assertTrue(loginPageURL.contains("https://www.zoopla.co.uk/"), "Login Page url doesn't contains login");
	  
	  WebElement searchButton = w.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[8]/button"));
	  Assert.assertTrue(searchButton.isDisplayed(), "Login Button not present ");

  }
  
  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
