package com.cyient.dynamic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RoyalSignupTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.royalcaribbean.com/account/create");
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Mak");
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Mishra");

		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[text()=' April ']")).click();
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[text()=' 3 ']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2000");

		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		driver.findElement(By.xpath("//span[text()=' India ']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("mak@gmail.com");
		driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("Mak12340000");

		driver.findElement(By.xpath("(//span[text()='Select one security question'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//span[contains(text(),' What is the name of the street where you first lived? ')]")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("M M Road");

		Thread.sleep(1000);
		driver.findElement(
		By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"))
				.click();

		driver.findElement(By.xpath("//button[text()=' Done ']")).click();
	}

}