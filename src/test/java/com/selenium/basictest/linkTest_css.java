package com.selenium.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTest_css 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",".\\WebDriver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("https://opensource-demo.orangehrmlive.com/");
		
		w.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		w.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		w.findElement(By.cssSelector("input.button")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Welcome 123")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Logout")).click();
		
		w.close();
		
		System.out.println("Login Succesfully......");
	}

}
