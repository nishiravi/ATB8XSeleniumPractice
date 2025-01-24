package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardActionClass {

    @Test
    public void fillFormUsingActionClass()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        WebElement firstname=driver.findElement(By.name("firstname"));
        Actions a=new Actions(driver);
        a.keyDown(Keys.SHIFT).sendKeys(firstname,"the testing academy").keyUp(Keys.SHIFT).build().perform();
    }
}
