//What is Explicit Wait in Selenium WebDriver? (Interview Question #15)
package com.kiran.java.seleniumtooracle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
