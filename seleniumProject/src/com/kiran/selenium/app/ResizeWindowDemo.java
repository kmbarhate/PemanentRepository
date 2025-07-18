//How to resize browser window using Selenium WebDriver? (Interview Question #50)
// window resizing using Dimension class.
package com.kiran.selenium.app;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindowDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        Dimension dimension= new Dimension(500,600);
        driver.manage().window().setSize(dimension);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.close();

    }
}
