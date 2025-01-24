package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MouseActionClass {

//   // @Test
//    public void fillFormUsingActionClass()
//    {
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.spicejet.com/");
//        WebElement fromLabel=driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));
//        Actions a=new Actions(driver);
//        a.moveToElement(fromLabel).click().build().perform();
//
//    }

    @Test
        public void SpiceJetAction()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
      driver.findElement(By.cssSelector(".css-1cwyjr8")).click();
      driver.findElement(By.xpath("//div[text()='India']")).click();
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".r-1rt2jqs .r-1dqxon3 .r-1otgn73 .r-cfp7ip")));
      List<WebElement> satecodes= driver.findElements(By.cssSelector(".r-1rt2jqs .r-1dqxon3 .r-1otgn73 .r-cfp7ip"));
      for(int i=0;i<satecodes.size();i++)
      {
          if(satecodes.get(i).getText().contains("AGR"))
          {
              satecodes.get(i).click();
              break;
          }


      }

    }
}
