//What is Fluent Wait in Selenium WebDriver? (Interview Question #16)
package com.kiran.java.seleniumtooracle;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluntWaitDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		// Enter data using JavascriptExecutor
		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		jsp.executeScript("arguments[0].value='kiran'", element);
		System.out.println(driver.getTitle());
		
		element = driver.findElement(By.xpath("//button[@name='login']"));
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5L))
				.pollingEvery(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class);

		element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("element"));
				
			}
			
		});
		
		element.click();
		driver.close();
	}
}
