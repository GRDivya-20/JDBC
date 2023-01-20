package com.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
			boolean  repeat=true;
			do {
				System.out.println("WELCOME TO TAJ");
				System.out.println("THIS IS YOUR MENU");
				System.out.println("1:AddMenu\n2:DeleteMenu\n3:UpdateMenu\n4:GetMenu\n5:Exit");
				System.out.println("enter your choice 1 to 5");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:{
					PreparedStatement ps=connection.prepareStatement("insert into menu values(?,?,?,?,?)");
					System.out.println("enter the id");
					int id=sc.nextInt();
					System.out.println("enter the item name");
					String name=sc.next();
					System.out.println("enter the cost");
					double cost=sc.nextDouble();
					System.out.println("enter the quantity");
					int qnt=sc.nextInt();
					System.out.println("enter the rating");
					double rating=sc.nextDouble();
					ps.setInt(1, id);
					ps.setString(2,name);
					ps.setDouble(3, cost);
					ps.setInt(4, qnt);
					ps.setDouble(5, rating);
					
					ps.execute();
					connection.close();
					System.out.println(" menu saved");
				}
				break;
				case 2:{
					
					PreparedStatement ps=connection.prepareStatement("delete from menu where id=?");
					System.out.println("enter the id");
					int id=sc.nextInt();
					ps.setInt(1,id);
				    ps.execute();
				    connection.close();
				    System.out.println("menu deleted");
				}
				break;
				case 3:{
					
					PreparedStatement ps=connection.prepareStatement("update menu set name=? where id=?");
					System.out.println("enter the name");
					String name=sc.next();
					System.out.println("enter the id");
					int id=sc.nextInt();
					ps.setString(1, name);
					ps.setInt(2, id);
					ps.execute();
				    System.out.println("updated");
				
				}
				break;
				case 4:{
					
					PreparedStatement ps=connection.prepareStatement("select * from menu");
				    ResultSet result =ps.executeQuery();
				    while(result.next()) {
				    	System.out.println("Menu id is "+result.getInt(1));
				    	System.out.println("Menu name is "+result.getString(2));
				    	System.out.println("Menu cost is "+result.getDouble(3));
				    	System.out.println("Menu qauntity is "+result.getInt(4));
				    	System.out.println("Menu Rating is "+result.getDouble(5));
				    	System.out.println("........................................");
				    }
				 
				    System.out.println("data displayed");
				}
				break;
				case 5:{
					repeat=false;
					System.out.println("THANK YOU");
				}
				break;
				
				default:
					System.out.println("Invalid choice");
				}
			}while(repeat);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
