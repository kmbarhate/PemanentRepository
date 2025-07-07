package com.kiran.properties.demo;
//Reading propeties file from our  computer  or hard drive.
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiedFileReadDemo {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("E:/abc/xyz/db.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("driverUsername"));
        System.out.println(properties.getProperty("driverClassName"));
        System.out.println(properties.getProperty("driverURL"));
        System.out.println(properties.getProperty("driverUserpassword"));
        Class.forName(properties.getProperty("driverClassName"));
        System.out.println("driver loaded");
        fileInputStream.close();

    }
}
