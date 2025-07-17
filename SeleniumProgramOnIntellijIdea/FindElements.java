//How to find more than one web element in Selenium WebDriver? (Interview Question #34)
package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().fullscreen();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        driver.close();
    }
}
