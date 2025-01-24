package com.theTestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable {

    @Test
    public void findrowsandcolumn()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        int noofcolumns=driver.findElements(By.xpath("//table/tbody/tr[1]/th")).size();
        System.out.println("no of column is "+noofcolumns);
        int noofrows=driver.findElements(By.xpath("//table/tbody/tr")).size();
        System.out.println("no of rows is "+noofrows);
        String firstpart="//table/tbody/tr[";
        String second_part="]/td[";
        String third_part="]";
        // traverse through each row and get data
        //i=2 because 1 row gives column heading
        for(int i=2;i<=noofrows;i++)
        {
            for(int j=1;j<=noofcolumns;j++)
            {
                String dynamic_xpath=firstpart+i+second_part+j+third_part;
                String data=driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);
                // get company and country of "Helen Bennett
                if(data.contains("Helen Bennett"))
                {
                    String company_xpath=dynamic_xpath+"/preceding-sibling::td";
                    String country_xpath=dynamic_xpath+"/following-sibling::td";
                    System.out.println("country of Helen Bennett is  "+driver.findElement(By.xpath(country_xpath)).getText());
                    System.out.println("company of Helen Bennett is "+driver.findElement(By.xpath(company_xpath)).getText());
                }
            }
        }
    }
}
