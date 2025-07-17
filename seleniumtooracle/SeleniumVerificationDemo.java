package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.By;
//What are the different verification points available in Selenium? (Interview Question #10)
//isDisplayed() getCurrentUrl() isEnabled() getCurrentUrl()getTitle() size() =======> Commands user for verifications.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumVerificationDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().fullscreen();
		
		if (driver.findElements(By.xpath("//input[@value='Login']")).size() != 0) {
			System.out.println("Element is present on web page");
		} else {
			System.out.println("Element is not present on web page");
		}
		System.out.println(driver.findElement(By.xpath("//h2[normalize-space()='New Customer']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h2[normalize-space()='New Customer']")).isEnabled());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
