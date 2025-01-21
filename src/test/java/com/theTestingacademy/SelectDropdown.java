package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdown {
    @Test
    public void selectDropdowncheck()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select option=new Select(dropdown);
        option.getFirstSelectedOption().click();
        option.selectByValue("AED");
        option.selectByIndex(3);
        option.selectByVisibleText("INR");
        driver.quit();


    }
}
