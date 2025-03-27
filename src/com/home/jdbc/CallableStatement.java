package com.home.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
CallableStatement interface is used to call the stored procedures and functions.

 */
public class CallableStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			java.sql.Statement smt = con.createStatement();
//			String procedure_statatement1 = "CREATE PROCEDURE `p1`() "
//					+ "BEGIN "
//					+ "insert into students(roll_number,name,grade) values(8,'Jignesh','B'); "
//					+ "update students set grade = 'A' where grade = 'B';"
//					+ "insert into students(roll_number,name,grade) values(9,'Lokesh','B'); "
//					+ "END";
//			
//			int i = smt.executeUpdate(procedure_statatement1);
//			java.sql.CallableStatement cs = (java.sql.CallableStatement) con.prepareCall("{call p1()}");
//	        int i1= cs.executeUpdate();
//			System.out.println(i1);
			
			java.sql.ResultSet r4 = smt.executeQuery("select * from students");
			while(r4.next()) {
				System.out.println("Roll Number = "+r4.getInt(1)+" Name = "+r4.getString(2)+" Grade = "+r4.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
