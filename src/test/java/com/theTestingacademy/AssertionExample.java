package com.theTestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class AssertionExample {

    @Test
    public void verifyTiltle()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String browsertitle=driver.getTitle();
        //TestNg Assert
        Assert.assertEquals(browsertitle,"CURA Healthcare Service");
        // AssertJ assertions.
        assertThat(browsertitle).isEqualTo("CURA Healthcare Service").isNotNull();
        System.out.println("titile is"+browsertitle);

    }
}
