//How to upload a file in Selenium WebDriver? (Interview Question #45)
//File in project path.
package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        String filepath = System.getProperty("user.dir");
        driver.findElement(By.id("uploadfile")).sendKeys(filepath+"\\File\\fileuploadDemo.txt");
        System.out.println("file uploaded successfully.......");

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        //driver.close();
    }
}