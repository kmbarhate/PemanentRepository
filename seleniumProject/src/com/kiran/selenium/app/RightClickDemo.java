//How to highlight elements using Selenium WebDriver? (Interview Question #55)
package com.kiran.selenium.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
    public static void main(String[] args)throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        Actions actons = new Actions(driver);
        //actons.moveToElement(driver.findElement(By.linkText("Mobiles"))).click().build().perform();
        actons.moveToElement(driver.findElement(By.linkText("Mobiles"))).contextClick().build().perform();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println("ContextClick performed.......");
        driver.close();
    }
}
