//How to perform double click action in Selenium WebDriver? (Interview Question #53)
package com.kiran.selenium.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Double click Here')]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        actions.moveToElement(element).doubleClick().build().perform();
        //                  OR
        //actions.doubleClick(element).build().perform();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
