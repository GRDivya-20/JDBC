package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			Statement statement=connection.createStatement();
		    statement.execute("insert into employee values (104,'pallavi',22,'Bcom',20000)");
		    connection.close();
		    System.out.println("Data Saved");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
