package com.selenium.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",".\\WebDriver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("http://demo.testfire.net/login.jsp");
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		
		Thread.sleep(2000);//puase for 2 sec
		
		w.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();
		w.close();
		System.out.println("Login Succesfully......");
	}
}
