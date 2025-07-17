package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.List;

public class BrokenDemo1 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ashokit.in/training-schedule");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement link:links){
            String url=link.getAttribute("href");
            System.out.println(url);
            if(url == null ||url.isEmpty()){
                System.out.println("links are empty...");
            }
            HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());
            huc.connect();
            if(huc.getResponseCode()>=400){
                System.out.println("links are broken..");
            }else{
                System.out.println("link are not broken......");
            }

        }
        driver.close();
    }
}
