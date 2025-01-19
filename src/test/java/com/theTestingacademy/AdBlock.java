package com.theTestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class AdBlock {

    @Test
    public void adBlock() {
        EdgeOptions options = new EdgeOptions();
        options.addExtensions(new File("src/test/java/com/theTestingacademy/AdBlock.crx"));

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
    }
}
