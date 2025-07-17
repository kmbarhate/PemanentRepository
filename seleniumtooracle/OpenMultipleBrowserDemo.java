//Why do we create a reference variable ‘driver’ of type WebDriver? (Interview Question #12)
package com.kiran.java.seleniumtooracle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenMultipleBrowserDemo {

	public static void main(String[] args) {
		String browser = "ie";
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("chrome open........");

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox open........");

		} else if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			System.out.println("InternetExplorer open........");

		} else {
			System.out.println("browser invalid");
		}
		driver.manage().window().fullscreen();
		driver.close();

	}

}
