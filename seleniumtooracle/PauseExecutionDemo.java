//How to pause execution using Selenium WebDriver? (Interview Question #21)
package com.kiran.java.seleniumtooracle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PauseExecutionDemo {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
		//selenium wait demonstration 
		synchronized(driver) {
			driver.wait(3000);
		}
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
