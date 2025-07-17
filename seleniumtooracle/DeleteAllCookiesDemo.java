//How to delete cookies in Selenium? (Interview Question #29)
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookiesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
