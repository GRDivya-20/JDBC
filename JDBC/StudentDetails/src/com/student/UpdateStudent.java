package com.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			Statement statement=connection.createStatement();
		    statement.execute("update  student set Sname='GRDivya' where USN='2gb18cs005'");
		    connection.close();
		    System.out.println("update student");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}