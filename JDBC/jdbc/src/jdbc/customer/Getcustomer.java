package jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Getcustomer {
public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer123","root","root");
			PreparedStatement statement=connection.prepareStatement("select * from customer where  age>20");
			
		    ResultSet result =statement.executeQuery();
		    while(result.next()) {
		    	System.out.println("customer id is "+result.getInt(1));
		    	System.out.println("customer name is "+result.getString(2));
		    	System.out.println("customer age is "+result.getInt(3));
		    	System.out.println("customer phone is "+result.getInt(4));
		    	System.out.println("........................................");
		    }
		    connection.close();
		    System.out.println("data displayed");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
