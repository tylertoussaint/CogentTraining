package com.cogent.Jdbc;

import java.sql.*;
import java.util.Scanner;

public class MySql {
	public static void main(String [] args) {
		String user="root";
		String password="audia4b8";
		String url="jdbc:mysql://localhost:3306/MySql";
		try {
		Connection con= DriverManager.getConnection(url, user, password);
		Statement st= con.createStatement();
		//Table Creation
		/*String sql="create table employees(id integer PRIMARY KEY NOT NULL, name varchar(20) NOT NULL, age int, salary numeric(10,2))";
		st.execute(sql);*/
		
		//Insert Values into Table
		/*String sql= "insert into employees values(1,'Marcus', 24, 50000.00)";
		st.executeUpdate(sql);
		String sql= "insert into employees values(2,'Davis', 39, 80000.23)";
		st.execute(sql);
		sql= "insert into employees values(3,'Arthur', 17, 15000.80)";
		st.execute(sql);*/
		
		//Print out Table in Console
		System.out.println("All employees ");
		String sql="select * from employees";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		//Search for Employees by Name with User Input 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name to search for: ");
		String name= sc.nextLine();
		
		 sql= "select * from employees where name = '"+name+"'";
		 rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
