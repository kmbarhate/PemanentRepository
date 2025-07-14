package com.kiran.headless.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FirefoxHeadlessDemo {

	public static void main(String[] args) throws Exception {

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.facebook.com/login/?locale=en_GB");
		// Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
		driver.manage().window().maximize();
		SoftAssert a = new SoftAssert();
		a.assertEquals(driver.getTitle(), "Log in to Facebook");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		a.assertAll();

	}

}
