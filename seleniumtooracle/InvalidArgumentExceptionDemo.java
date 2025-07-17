//What happens if we run this command driver.get(“www.google.com”);?
// throws InvalidArgumentException
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidArgumentExceptionDemo {
public static void main(String[] args) {
	WebDriver driver = new 	ChromeDriver();
	//driver.navigate().to("www.google.com/");//throws InvalidArgumentException
	//we must prefix every url with https://
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	driver.close();
}
}
