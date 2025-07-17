//How to press Enter key using Selenium WebDriver? (Interview Question #20)

package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEnterkeyDemo {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		// Enter data using JavascriptExecutor
		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		jsp.executeScript("arguments[0].value='kiran'", element);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
		Thread.sleep(300);
		driver.close();
	}

}
