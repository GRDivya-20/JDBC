package student.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentImpliments implements StudentInterface{
   Scanner sc=new Scanner(System.in);
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("enter the student id");
		int id=sc.nextInt();
		System.out.println("enter the student name");
		String name=sc.next();
		System.out.println("enter the student age");
		int age=sc.nextInt();
		System.out.println("enter the student phone");
		int phone=sc.nextInt();
		System.out.println("enter the student gender");
		String gender=sc.next();
		System.out.println("enter the student marks");
		double marks=sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement ps=connection.prepareStatement("insert into student values(?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setInt(4, phone);
			ps.setString(5, gender);
			ps.setDouble(6, marks);
			System.out.println("data saved");
			ps.execute();
			connection.close();
			System.out.println("data saved");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement ps=connection.prepareStatement("delete from student where id=?");
			System.out.println("enter the id");
			int id=sc.nextInt();
			ps.setInt(1,id);
		    ps.execute();
		    connection.close();
		    System.out.println("menu deleted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement ps=connection.prepareStatement("update menu set name=? where id=?");
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the id");
			int id=sc.nextInt();
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
		    System.out.println("updated");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void GetAllStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GetbyStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllStudent() {
		// TODO Auto-generated method stub
		
	}

}
