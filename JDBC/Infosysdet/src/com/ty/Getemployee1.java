package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Getemployee1 {
public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys1","root","root");
			Statement statement=connection.createStatement();
			
		    ResultSet result =statement.executeQuery("select * from employee where sal>50000 and age>20 and phone like '74%'");
		    while(result.next()) {
		    	System.out.println("employee id is "+result.getInt(1));
		    	System.out.println("employee name is "+result.getString(2));
		    	System.out.println("employee sal is "+result.getDouble(3));
		    	System.out.println("employee designation is "+result.getString(4));
		    	System.out.println("employee age is "+result.getInt(5));
		    	System.out.println("employee gender is "+result.getString(6));
		    }
		    connection.close();
		    System.out.println("data displayed");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
