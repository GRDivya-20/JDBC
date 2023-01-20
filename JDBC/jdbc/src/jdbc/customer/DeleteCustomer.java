package jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteCustomer {
public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer123","root","root");
			PreparedStatement ps=connection.prepareStatement("delete from customer where id=?");
			ps.setInt(1,102);
		    ps.execute();
		    connection.close();
		    System.out.println("Data Delete");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
