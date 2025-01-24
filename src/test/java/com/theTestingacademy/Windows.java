package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Windows {
    @Test
    public void checkemployeestatus() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//div[@class='example' ]/a[@href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(" windows open are " + windows);
        Iterator<String> it = windows.iterator();
        if (it.hasNext()) {

            String parentwindow = it.next();
            String childWindow = it.next();
            driver.switchTo().window(parentwindow);
            String parenturl = driver.switchTo().window(parentwindow).getCurrentUrl();
            driver.navigate().to(parenturl);
            driver.navigate().back();

        }
    }
}
