package com.cyient.multitab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Db4Free {

			                        
		   public static void main(String[] args) {
               // TODO Auto-generated method stub
               WebDriver driver= new ChromeDriver();
               driver.manage().window().maximize();
       driver.get("https://www.db4free.net/");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
      driver.findElement(By.xpath("//a[@target='_blank']")).click();
  
       String tab1=  driver.getWindowHandle();
       System.out.println(tab1);
       Set<String> tabSession=driver.getWindowHandles();
       for(String tabsession:tabSession)
       {
               System.out.println(tabsession);
               driver.switchTo().window(tabsession);
               String currenttitle= driver.getTitle();
               System.out.println(currenttitle);
               
               if(currenttitle.equals("phpMyAdmin"))
               {
                       break;
               }
       }        
      driver.findElement(By.id("input_username")).sendKeys("test123");
      driver.findElement(By.id("input_password")).sendKeys("test123");
      driver.findElement(By.id("input_go")).click();
   String b=driver.findElement(By.xpath("(//div[@role='alert'])[3]")).getText();
   System.out.println(b);
      driver.close();      
    
			

			
			
	}

}
