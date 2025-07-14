package com.kiran.java.propertiesDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("E:/abc/xyz/db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("OracleClass"));
		System.out.println(prop.getProperty("oracleConnection"));
		System.out.println(prop.getProperty("oracleUser"));
		System.out.println(prop.getProperty("oraclePass"));
		
		fis.close();
		

	}

}
