package com.kiran.java.propertiesDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileOutputStream fos = new FileOutputStream("E:/abc/xyz/db1.properties");
		
		prop.setProperty("OracleClass","oracle.jdbc.OracleDriver");
		prop.setProperty("oracleConnection","jdbc:oracle:thin:@localhost:1521:orcl");
		prop.setProperty("oracleUser","system");
		prop.setProperty("oraclePass","kiran");
		prop.store(fos,"JDBC Parameters");
		System.out.println("Data send to the file successfully..............");
		fos.close();
		
		
		
		
		
	}

}
