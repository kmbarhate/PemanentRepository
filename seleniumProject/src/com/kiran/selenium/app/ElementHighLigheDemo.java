package com.kiran.selenium.app;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementHighLigheDemo {
    public static void main(String[] args) throws Exception {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/login/");
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       // driver.findElement(By.xpath(""));
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        javascriptExecutor.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px dotted green;');",element);
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }

}
