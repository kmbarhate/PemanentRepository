//What are the different navigation commands in Selenium WebDriver? (Interview Question #26)
//navigate.to() navigate.refresh() navigate.back() navigate.farward()
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
