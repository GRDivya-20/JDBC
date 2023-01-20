package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetEmployee {
public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			Statement statement=connection.createStatement();
		    ResultSet result =statement.executeQuery("select * from employee where id=101");
		    while(result.next()) {
		    	System.out.println("employee id is "+result.getInt(1));
		    	System.out.println("employee name is "+result.getString(2));
		    	System.out.println("employee age is "+result.getInt(3));
		    	System.out.println("employee designation is "+result.getString(4));
		    	System.out.println("employee salary is "+result.getDouble(5));
		    	System.out.println("................................................");
		    }
		    ResultSet result1 =statement.executeQuery("select * from employee where id=102");
		    while(result1.next()) {
		    	System.out.println("employee id is "+result1.getInt(1));
		    	System.out.println("employee name is "+result1.getString(2));
		    	System.out.println("employee age is "+result1.getInt(3));
		    	System.out.println("employee designation is "+result1.getString(4));
		    	System.out.println("employee salary is "+result1.getDouble(5));
		    	System.out.println("................................................");
		    }
		    connection.close();
		                                                                                                                        
		    System.out.println("update student");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
