//How to fetch the current page URL in Selenium WebDriver? (Interview Question #27)
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
