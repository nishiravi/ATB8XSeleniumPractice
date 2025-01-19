package com.theTestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigationcmd {

    WebDriver driver=new ChromeDriver();
    @Test
    public void navigationcmdMethod()
    {
        driver.get("https://app.eraser.io/workspace/gAY5BedoQPtNX15ffrWo");
        driver.navigate().back(); // to click back on the browser
        driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();
    }

}
