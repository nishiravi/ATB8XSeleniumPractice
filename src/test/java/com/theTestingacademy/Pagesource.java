package com.theTestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Pagesource {

    @Test
    public void verifypagesource()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String browsertitile=driver.getTitle();
        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println(" title matched and present in pagesource");
        }

    }
}
