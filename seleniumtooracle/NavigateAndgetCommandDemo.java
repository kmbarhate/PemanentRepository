//What is an alternative to get() command in Selenium WebDriver? (Interview Question #24)
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndgetCommandDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//For open url we can use either get("url") OR navigate().to("url")
		//driver.navigate().to("https://www.google.com/");
				//OR
		driver.get("https://www.google.com/");
				
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.close();
		
		
	}

}
