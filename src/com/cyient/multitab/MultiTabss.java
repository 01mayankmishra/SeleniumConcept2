package com.cyient.multitab;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiTabss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> tabs=driver.getWindowHandles();
		for(String tabsSessions:tabs)
		{
			System.out.println(tabsSessions);
			driver.switchTo().window(tabsSessions);
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.id("Email_Id")).sendKeys("mak@gmail.com");
		driver.findElement(By.id("mobile_number")).sendKeys("12121212");
		Select s= new Select(driver.findElement(By.id("Title")));
		s.selectByVisibleText("Ms.");
		driver.findElement(By.id("FirstName")).click();
		//driver.findElement(By.linkText("Travel")).click();
		
		driver.close();
	}

}
