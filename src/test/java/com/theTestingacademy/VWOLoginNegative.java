package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class VWOLoginNegative {

    @Test
    public void verifyLoginErrorMsg() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("nishi");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(1000);
        String actual = driver.findElement(By.id("js-notification-box-msg")).getText();
        assertThat(actual).isNotNull().isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");
        System.out.println("error message is" + actual);
        driver.findElement(By.partialLinkText("free trial")).click();
        driver.quit();
    }
}