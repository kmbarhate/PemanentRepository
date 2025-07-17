//How to read a JavaScript variable in Selenium WebDriver? (Interview Question #35)
//getting title of web page using JavascriptExecutor.
package com.selenium.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        String title = (String) javascriptExecutor.executeScript("return document.title");
        System.out.println(title);
       driver.close();

    }
}
