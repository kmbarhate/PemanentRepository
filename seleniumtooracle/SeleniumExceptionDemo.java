package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.By;
//What are different types of Selenium WebDriver Exceptions you have faced? (Interview Question #11)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptionDemo {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// NoSuchElementException.
		// System.out.println(driver.findElement(By.xpath("//input[@value='Logi']")).isDisplayed());

		// InvalidSelectorException
		// System.out.println(driver.findElement(By.xpath("///input[@value='Logi']")).isDisplayed());

		// NoAlertPresentException
		// driver.switchTo().alert();

		// NoSuchFrameException
		// driver.switchTo().frame("kiran");

		//
		driver.quit();
		// NoSuchSessionException
		System.out.println(driver.findElement(By.xpath("///input[@value='Logi']")).isDisplayed());

	}

}
