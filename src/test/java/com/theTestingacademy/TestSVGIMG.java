package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSVGIMG {
    @Test
    public void svgTestClick() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@class='Pke_EE'][1]")).sendKeys("macmini");
        Thread.sleep(3000);
       List<WebElement> svgElements= driver.findElements(By.xpath("//*[name()='svg']"));
       svgElements.get(0).click();

    }
}
