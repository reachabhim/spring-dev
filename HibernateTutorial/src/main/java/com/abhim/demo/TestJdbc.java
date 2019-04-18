package com.abhim.demo;

import java.sql.DriverManager;

import java.sql.Connection;

public class TestJdbc 
{
    public static void main( String[] args )
    {
    	String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
    	String userId="hbstudent";
    	String password = "Woskxm*9";
        try {
        	Connection myConn = DriverManager.getConnection(jdbcUrl,userId,password);
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
