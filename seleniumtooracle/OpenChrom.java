//Implicit Wait in Selenium WebDriver (Interview Question #14)
//Opening chrome in headless mode and reading properties file
package com.kiran.java.seleniumtooracle;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenChrom extends Test {
	public static void main(String[] args) throws Exception {

		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("oracleClass"));
		System.out.println(properties.getProperty("oracleUrl"));
		System.out.println(properties.getProperty("oracleUser"));
		System.out.println(properties.getProperty("oracleUpass"));

		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to(properties.getProperty("url"));
		System.out.println(properties.getProperty("url"));
		driver.manage().window().fullscreen(); // Thread.sleep(3000);
		System.out.println(driver.getTitle());

		// implicitwait demonstrations
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// WebDriverWait demonstrations.

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		// WebElement element=driver.findElement(By.id("loginbutton"));
		// wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		// wait.until(ExpectedConditions.elementToBeSelected(element));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginbutton")));
		fis.close();
		driver.close();

	}

}
