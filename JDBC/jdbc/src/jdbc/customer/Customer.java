package jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer {
	 public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer123","root","root");
			PreparedStatement ps=connection.prepareStatement("insert into customer values(?,?,?,?)");
			ps.setInt(1,103);
			ps.setString(2,"anjali");
			ps.setInt(3,23);
			ps.setInt(4,734965);
			ps.execute();
			connection.close();
			System.out.println("data saved");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	 
}

