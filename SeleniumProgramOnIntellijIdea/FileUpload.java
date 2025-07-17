//How to upload a file in Selenium WebDriver? (Interview Question #45)
//file in our hard drive or computer.
package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("uploadfile")).sendKeys("E:\\abc\\xyz\\fileuploadDemo.TXT");
        System.out.println("file uploaded successfully.......");

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.close();
    }

}
