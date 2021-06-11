package com.cyient.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//to maximize browser  
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//implicit wait--imp for interviews
driver.get("https://www.medibuddy.in/");//wait untill the page load is complete
//Thread.sleep(15000);//wait for 15 seconds on the page
driver.findElement(By.linkText("Signup")).click();
//Thread.sleep(5000);

driver.findElement(By.name("firstName")).sendKeys("Mak");
driver.findElement(By.name("phone")).sendKeys("11111111");
driver.findElement(By.name("username")).sendKeys("makattack");
driver.findElement(By.name("password")).sendKeys("ppt00");
driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
//findElement will check only for 0.5 sec and if element not found it will 
//throw a error hence we use conditional wait of 15 sec to load page properly
driver.findElement(By.name("employeeId")).sendKeys("1234");
Select selectYear = new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
selectYear.selectByVisibleText("2000");
Select selectMonth = new Select(driver.findElement(By.xpath("//select[@ng-model='date.month']")));
selectMonth.selectByVisibleText("04");
Select selectDate = new Select(driver.findElement(By.xpath("//select[@ng-model='date.day']")));
selectDate.selectByVisibleText("01");

driver.findElement(By.xpath("//span[text()='Male']")).click();
	}

}
