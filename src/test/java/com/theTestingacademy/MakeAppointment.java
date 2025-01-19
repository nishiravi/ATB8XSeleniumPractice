package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class MakeAppointment {

    @Test
    public void verifyCurrentURL() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("btn-make-appointment")).click();
        String username=driver.findElement(By.xpath("//input[@placeholder='Username']")).getAttribute("value");
        String password=driver.findElement(By.cssSelector("input[placeholder='Password']")).getAttribute("value");
         driver.findElement(By.id("txt-username")).sendKeys(username);
         driver.findElement(By.id("txt-password")).sendKeys(password);
         driver.findElement(By.id("btn-login")).click();
         assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");
         driver.quit();
    }
}
