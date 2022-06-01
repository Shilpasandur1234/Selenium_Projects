package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginMutualFund {
	WebDriver w;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",".\\WebDriver\\chromedriver.exe");
	  w=new ChromeDriver();
  }

  @Test(priority = 0,description="test case to verify login 1st ",invocationCount =1)
  public void f() throws Exception
  {
	    w.get("http://demo.testfire.net/login.jsp");
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();
  }
  @Test(priority = 1,description="test case to verify login ", dependsOnMethods ="f", groups ="Login")  
  public void LoginAdminUser() throws Exception
  {
	    w.get("http://demo.testfire.net/login.jsp");
		w.findElement(By.id("uid")).sendKeys("tuser");
		w.findElement(By.name("passw")).sendKeys("tuser");
		w.findElement(By.name("btnSubmit")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();
  }
  @Test(priority = 2,description="Last test case to verify login ", dependsOnMethods ="f")  
  public void LoginAdminUser1() throws Exception
  {
	    w.get("http://demo.testfire.net/login.jsp");
		w.findElement(By.id("uid")).sendKeys("jsmith");
		w.findElement(By.name("passw")).sendKeys("jsmith");
		w.findElement(By.name("btnSubmit")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();
  }
  @AfterTest
  public void afterTest() {
	  w.close();
	  System.out.println("Login Succesfully......");
  }

}
