package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

//    @Test
//    public void verifyRealtiveLocators() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("google.com");
//        // relative locators bellow
//        driver.findElement(with(By.id("name")).toRightOf(By.id("a"))).click();
//        driver.findElement(with(By.id("name")).toLeftOf(By.id("a"))).click();
//        driver.findElement(with(By.id("name")).below(By.id("a"))).click();
//        driver.findElement(with(By.id("name")).above(By.id("a"))).click();
//        driver.findElement(with(By.id("name")).near(By.id("a"))).click();
//    }

    @Test
    public void test_RL_P3() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        Thread.sleep(15000);
        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        WebElement username=driver.findElement(By.id("username"));
        WebElement errormsg=driver.findElement(with(By.tagName("small")).below(username));
        String errormsgtext=errormsg.getText();
        System.out.println(errormsgtext);

    }
}
