package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {
public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys1","root","root");
			Statement statement=connection.createStatement();
		    statement.execute("delete from employee where age>=60");
		    connection.close();
		    System.out.println("Data Delete");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
