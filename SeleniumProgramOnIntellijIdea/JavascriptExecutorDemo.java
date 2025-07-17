//What is JavascriptExecutor and in which case it will help in Selenium ? (Interview Question #36)
//Page scroll up and click() and alert showing using javascriptExecutor
package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://nmu.ac.in/en-us/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        //javascriptExecutor.executeScript("alert('The Great Kiran.')");
        WebElement element = driver.findElement(By.id("viewall"));
        Thread.sleep(3000);
        //javascriptExecutor.executeScript("window.scrollBy(0,700)", element);
        javascriptExecutor.executeScript("arguments[0].click()", element);
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }

}
