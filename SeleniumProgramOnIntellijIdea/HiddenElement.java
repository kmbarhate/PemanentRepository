//How to handle hidden elements in Selenium WebDriver? (Interview Question #32)
package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='Hide']")).click();
        //below line shows ElementNotInteractableException to avoid use JavascriptExecutor
       // driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("hello kiran");
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("document.getElementById('displayed-text').value='hello kiran'");
        driver.close();

    }
}
