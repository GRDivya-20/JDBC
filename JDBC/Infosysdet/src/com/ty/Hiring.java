package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Hiring {
     public static void main(String[] args) {
    	 try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys1","root","root");
				Statement statement=connection.createStatement();
				statement.execute("insert into employee values(108,'deepak',37000,'softwaredeveloper',74835176,'female',60)");
			    connection.close();
			    System.out.println("Data saved");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
