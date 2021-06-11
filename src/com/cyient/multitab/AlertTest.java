package com.cyient.multitab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		driver.switchTo().alert().accept();
		// TODO Auto-generated method stub

	}

}
