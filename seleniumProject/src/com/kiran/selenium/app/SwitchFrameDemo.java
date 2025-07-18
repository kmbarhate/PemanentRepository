//How to perform drag and drop action in Selenium WebDriver? (Interview Question #54)
//Switching to window and drag and drop action
package com.kiran.selenium.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class SwitchFrameDemo {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().frame(0);
        Actions actios = new Actions(driver);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Thread.sleep(5000);

        actios.dragAndDrop(draggable, droppable).build().perform();
        System.out.println("drag and drop action completed.........");
        System.out.println(driver.getCurrentUrl());

        //driver.findElement(By.xpath(""))
        driver.switchTo().defaultContent();
        driver.close();
    }
}
