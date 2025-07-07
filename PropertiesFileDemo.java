package com.kiran.properties.demo;

//writting properties file in our computer.
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {
    public static void main(String args[]) throws IOException {
        Properties properties= new Properties();
        properties.setProperty("driverClassName","oracle.jdbc.OracleDriver");
        properties.setProperty("driverURL","jdbc:oracle:thin:@localhost:1521:orcl");
        properties.setProperty("driverUsername","system");
        properties.setProperty("driverUserpassword","kiran");
        FileOutputStream fileOutputStream=new FileOutputStream("E:/abc/xyz/db.properties");
            properties.store(fileOutputStream,"Jdbc Parameters");
            fileOutputStream.close();
    }
}
