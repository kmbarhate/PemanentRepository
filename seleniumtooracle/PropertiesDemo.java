//Reading Propeties file.
package com.kiran.java.seleniumtooracle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("oracleClass"));
		System.out.println(properties.getProperty("oracleUrl"));
		System.out.println(properties.getProperty("oracleUser"));
		System.out.println(properties.getProperty("oracleUpass"));
		fis.close();

	}

}
