package com.kiran.java.seleniumtooracle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOutExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		// TimeoutException Because page take morethan 1 seconds to load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.className("dropbtn")).click();

		driver.findElement(By.linkText("Facebook")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		;

	}

}
