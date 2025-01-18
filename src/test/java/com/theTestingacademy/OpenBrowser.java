package com.theTestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

    @Test
    public void openBrowser()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://restful-booker.herokuapp.com/");
        driver.quit();
    }
}
