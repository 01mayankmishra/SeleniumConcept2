package com.cyient.redbus;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSignIn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("hc")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.id("mobileNoInp")).sendKeys("909090990");
		driver.findElement(By.id("otp-container")).click();
	}

		}





