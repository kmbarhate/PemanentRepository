//How can we maximize browser window in Selenium WebDriver? (Interview Question #28)
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
