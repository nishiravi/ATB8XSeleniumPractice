package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable2 {

    @Test
    public void checkemployeestatus() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Hacker@4321");
        driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement scroll_till=driver.findElement(By.xpath("//span[contains(@class,'oxd-text') and text()=' (169) Records Found']"));
        js.executeScript("arguments[0].scrollIntoView(true)",scroll_till);
        List<WebElement> data=driver.findElements(By.xpath("//div[@class='oxd-table-card']/div[contains(@class,'oxd-table-row')]"));
      for(int i=1;i<data.size();i++)
      {
         if(data.get(i).getText().contains("Terminated"))
         {

                  driver.findElement(By.cssSelector(".bi-trash")).click();

         }
      }
        driver.quit();
    }
}
