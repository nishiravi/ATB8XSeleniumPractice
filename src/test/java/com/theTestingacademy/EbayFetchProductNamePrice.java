package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class EbayFetchProductNamePrice {

    @Test
    public void fetchNameAndPrice()
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Actions a=new Actions(driver);
        a.sendKeys(driver.findElement(By.cssSelector(".gh-search-input")),"macmini").sendKeys("\n").perform();
       List<WebElement> deviceTitle=driver.findElements(By.cssSelector(".s-item__title"));
        List<WebElement> devicePrice=driver.findElements(By.cssSelector(".s-item__price"));
        int size=Math.min(deviceTitle.size(), devicePrice.size());
       for(int i=0;i<size;i++)
       {
           System.out.println(deviceTitle.get(i).getText() +"||"+devicePrice.get(i).getText());

       }
       driver.quit();
    }
}
