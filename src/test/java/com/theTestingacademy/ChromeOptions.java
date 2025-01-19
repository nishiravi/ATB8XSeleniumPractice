package com.theTestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class ChromeOptions {
    @Test
    public void headlessMode() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://restful-booker.herokuapp.com/");
        System.out.println(driver.getTitle());
    }
}
