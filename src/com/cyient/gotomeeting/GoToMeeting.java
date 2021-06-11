package com.cyient.gotomeeting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoToMeeting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.gotomeeting.com/en-in");
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.linkText("Start for Free")).click();

		driver.findElement(By.id("first-name")).sendKeys("Mak");
		driver.findElement(By.id("last-name")).sendKeys("Mishra");
		driver.findElement(By.name("Email")).sendKeys("makattack@gmail.com");
		driver.findElement(By.id("contact-number")).sendKeys("01010101010");

		Select selectJobTitle = new Select(driver.findElement(By.name("JobTitle")));
		selectJobTitle.selectByVisibleText("Help Desk");

		driver.findElement(By.id("login__password")).sendKeys("makPass121212");

        driver.findElement(By.xpath("(//div[@class='form-fields__radio'])[2]")).click();
		driver.findElement(By.xpath("//button[@data-button='trial-submit']")).click();

	}

}
