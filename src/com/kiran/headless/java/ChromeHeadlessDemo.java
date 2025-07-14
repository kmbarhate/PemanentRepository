package com.kiran.headless.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ChromeHeadlessDemo {
	public static void main(String[] args) throws Exception {

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);

		driver.navigate().to("https://www.facebook.com/login/?locale=en_GB");

		Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
		SoftAssert a = new SoftAssert();
		// a.assertEquals(driver.getTitle(), "Kiran is the great");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		driver.close();
		// a.assertAll();
	}
}
