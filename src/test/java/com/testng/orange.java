package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class orange {
	WebDriver w;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",".\\WebDriver\\chromedriver.exe");
	  w=new ChromeDriver();
  }
  
  @Test
  public void f() throws Exception
  { 
	  w.get("https://opensource-demo.orangehrmlive.com/");
		
		w.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		w.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		w.findElement(By.cssSelector("input.button")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Welcome Tester")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Logout")).click();
  }

  @AfterTest
  public void afterTest() {
	  w.close();
		
		System.out.println("Login Succesfully......");
	  
  }

}
