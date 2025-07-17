package com.kiran.java.seleniumtooracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadTableFromOracle {

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver loaded........");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "kiran");
		System.out.println("Connection Established.....");
		
		Statement stat = con.createStatement();
		
		ResultSet rs = stat.executeQuery("select * from selenium");
		
		System.out.println("uname\tupass");		
		System.out.println("---------------");
		
		while (rs.next()) {
			String uname = rs.getString("uname");
			String upass = rs.getString("upass");
			System.out.println(uname + "\t" + upass);

		}
		con.close();

	}

}
