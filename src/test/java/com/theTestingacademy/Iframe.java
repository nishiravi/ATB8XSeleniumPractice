package com.theTestingacademy;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Iframe {
    @Description("Verify Heatmap(app.vwo.com")
    @Test
    public void test_heatmap_clickmap_button() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String parentwindowidow=driver.getWindowHandle();
        List<WebElement> list_heatmap=driver.findElements(By.cssSelector(".screenshot-thumb.ng-isolate-scope"));
        Actions a=new Actions(driver);
        a.moveToElement(list_heatmap.get(1)).click().build().perform();

        Thread.sleep(13000);

        Set<String> windows=driver.getWindowHandles();
        for(String currentwindow:windows)
        {
         if(!currentwindow.contains(parentwindowidow))
         {
             driver.switchTo().window(currentwindow);
            WebElement heatmap_frame=driver.findElement(By.id("heatmap-iframe"));
             driver.switchTo().frame(heatmap_frame);
             WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']"));
             clickmap.click();
         }
        }



    }
}
