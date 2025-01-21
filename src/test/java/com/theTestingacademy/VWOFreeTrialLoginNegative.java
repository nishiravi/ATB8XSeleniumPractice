package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VWOFreeTrialLoginNegative {

    @Test
    public void verifyLoginErrorMsg() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vwo.com/free-trial");
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("admin");
        driver.findElement(By.id("page-434cu-gdpr-consent-checkbox")).click();

       List<WebElement> buttons=driver.findElements(By.tagName("button"));
       buttons.get(0).click();
        Thread.sleep(1000);
        String actual = driver.findElement(By.className("invalid-reason")).getText();
        assertThat(actual).isNotNull().isNotEmpty().isNotBlank().isEqualTo("The email address you entered is incorrect.");
        System.out.println("error message is" + actual);
        driver.quit();
    }
}