//Reading properties file .
package com.kiran.java.seleniumtooracle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
	
	public void p() throws Exception {
		Properties properties= new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("oracleClass"));
		System.out.println(properties.getProperty("oracleUrl"));
		System.out.println(properties.getProperty("oracleUser"));
		System.out.println(properties.getProperty("oracleUpass"));
		//String url=properties.getProperty("url");
		System.out.println(properties.getProperty("url"));
		//System.out.println(url);	
		fis.close();
	}
	public static void main(String args[]) throws Exception {
		Test test = new Test();
		test.p();
	
	}

	 

}
