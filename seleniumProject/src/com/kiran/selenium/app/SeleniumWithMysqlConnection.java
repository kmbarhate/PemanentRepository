//How to achieve database testing in Selenium? (Interview Question #59)
//selenum with mysql connectivity and fetching the record.
package com.kiran.selenium.app;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SeleniumWithMysqlConnection {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded...............");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kirandb","root","root");
        Statement statement=connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from emp3");
        System.out.println("username\tuserpassword");
        System.out.println("-------------------------");
                while (resultSet.next()){
            String uname=resultSet.getNString(1);
            String upass=resultSet.getString(2);
            System.out.println(uname+"\t\t"+upass);
        }
        connection.close();



    }
}
