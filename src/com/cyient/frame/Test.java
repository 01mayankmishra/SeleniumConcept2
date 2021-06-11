
package com.cyient.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
        
public static void main(String[] args) throws InterruptedException  {
        WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.openemr.io/openemr/interface/login/login.php?site=default");
        
                             //lOGIN
          driver.findElement(By.id("authUser")).sendKeys("admin");
            driver.findElement(By.id("clearPass")).sendKeys("pass");
        
                               //DROPDOWN
                Select selectlanguage= new Select(driver.findElement(By.name("languageChoice")));
                selectlanguage.selectByVisibleText("English (Indian)");
                driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
                
                Actions action= new Actions(driver);
                action.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();
        //action.moveToElement(driver.findElement(By.xpath("//li[text()='Patients']"))).click();
                
          // Thread.sleep(10000);
                driver.findElement(By.xpath("//div[text()='Patients']")).click();
                
                driver.switchTo().frame(driver.findElement(By.name("fin")));
                driver.findElement(By.xpath("//button[text()='Add New Patient']")).click();
                driver.switchTo().defaultContent();
                driver.switchTo().frame(driver.findElement(By.name("pat")));
                driver.findElement(By.id("form_fname")).sendKeys("rutwik");
                driver.findElement(By.id("form_mname")).sendKeys("aniruddha");
                driver.findElement(By.id("form_lname")).sendKeys("kulkarni");
                
                Select sex= new Select(driver.findElement(By.id("form_sex")));
                sex.selectByVisibleText("Male");
                
                driver.findElement(By.name("form_DOB")).sendKeys("2021-06-04");
                driver.findElement(By.name("create")).click();
                driver.switchTo().defaultContent();
                driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-100 h-100 modalIframe']")));
                driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
                
                Thread.sleep(5000);
                  String alerttest = driver.switchTo().alert().getText();
          System.out.println(alerttest);
          driver.switchTo().alert().accept();
                driver.findElement(By.className("closeDlgIframe")).click();
                
                driver.switchTo().defaultContent();
                
                String ptname=new String(driver.findElement(By.className("ptName")).getText());
                System.out.println(ptname);
                
                
}

}