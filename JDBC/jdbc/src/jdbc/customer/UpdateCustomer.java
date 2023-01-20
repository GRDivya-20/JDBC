package jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateCustomer {
public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer123","root","root");
			PreparedStatement ps=connection.prepareStatement("update customer set name=? where id=?");
			ps.setString(1, "devil");
			ps.setInt(2, 103);
		    ps.execute();
		    connection.close();
		    System.out.println("update customer");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
