package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcInsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil","root","root");
			System.out.println("connection created");
			
			Statement s=c.createStatement();
			System.out.println("Statement created successfully");
			
			String q="insert into student values(103, 'rutu', 'JS', 60.50)";

			boolean s1=s.execute(q);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
	}
