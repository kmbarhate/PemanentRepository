package com.kiran.java.seleniumtooracle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		try {
			 driver= new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/login/");
			driver.manage().window().fullscreen();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.findElement(By.name("email")).sendKeys("kiran");
			driver.close();
			
		}
		catch(Exception e) {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("screenshot.png"));
		}

	}

}
