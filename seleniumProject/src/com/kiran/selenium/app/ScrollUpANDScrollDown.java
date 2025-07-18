//How to scroll web page up and down using Selenium WebDriver? (Interview Question #51)
package com.kiran.selenium.app;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollUpANDScrollDown {
    public static void main(String[] args)throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://nmu.ac.in/en-us/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
        Thread.sleep(5000);
        javascriptExecutor.executeScript("window.scrollBy(0,600)");
        Thread.sleep(5000);
        javascriptExecutor.executeScript("window.scrollBy(0,-600)");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
