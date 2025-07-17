//Different ways for refreshing the page using Selenium WebDriver (Interview Question #30)
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FiveWayToRefreshPageDemo {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 * 1st way to refresh the page. driver.navigate().refresh();
		 */
		/*
		 * 2nd way to refresh the page using Actions class. Actions actions= new
		 * Actions(driver); actions.sendKeys(Keys.F5);
		 */
		/*
		 * 3rd way to refresh the page. JavascriptExecutor
		 * jsp=(JavascriptExecutor)driver;
		 * jsp.executeScript("window.location.reload();");
		 */
		// 4th way to refresh page.
		// driver.get(driver.getCurrentUrl());
		// 5th way to refresh the page.
		driver.navigate().to(driver.getCurrentUrl());

	}

}
