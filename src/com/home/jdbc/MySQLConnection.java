package com.home.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			if(con != null) {
				System.out.println("JDBC connection successfull");
			}
			java.sql.Statement smt = con.createStatement();
			
//			String query1 = "INSERT INTO students(roll_number,name,grade) values(4,'Vijay','B')";
//			smt.executeUpdate(query1);
//			System.out.println("Inserted new record Successfully");
//			
//			String query2 = "UPDATE students SET grade = 'A' WHERE grade = 'B'";
//			smt.executeUpdate(query2);
//			System.out.println("Updated record Successfully");
//			
//			String query3 = "DELETE FROM students WHERE roll_number = 4";
//			smt.executeUpdate(query3);
//			System.out.println("Deleted record Successfully");
//			
			String query4 = "select * from students";
			java.sql.ResultSet res = smt.executeQuery(query4);
			while(res.next()) {
				System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);	
		}
	}
}
/*
-- create database school;
-- use school;
-- create table students(
-- 	roll_number int primary key,
--     name varchar(50),
--     grade varchar(1)
-- );
-- desc students;
-- select * from students;
*/