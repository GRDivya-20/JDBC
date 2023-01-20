package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			Statement statement=connection.createStatement();
		    statement.execute("insert into student values ('2gb18cs005','G R Divya',22,'CSE',7.6)");
		    connection.close();
		    System.out.println("Data Saved");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
