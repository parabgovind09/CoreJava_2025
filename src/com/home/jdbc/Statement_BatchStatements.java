package com.home.jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Statement_BatchStatements {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			java.sql.Statement smt = con.createStatement();
			
			//basic statements
			
			//inserting single row into students
//			String q1 = "insert into students(roll_number,name,grade) values(4,'Vijay','B')";
//			smt.executeUpdate(q1);
//			java.sql.ResultSet r1 = smt.executeQuery("select * from students");
//			while(r1.next()) {
//				System.out.println("ID: " + r1.getInt("roll_number") + ", Name: " + r1.getString("name")+", Grade "+ r1.getString("grade"));
//			}
			
			//updating single row into students
//			String q2 = "update students set grade = 'A' where grade = 'B'";
//			smt.executeUpdate(q2);
//			java.sql.ResultSet r2 = smt.executeQuery("select * from students");
//			while(r2.next()) {
//				System.out.println("Roll "+r2.getInt(1)+" Name "+r2.getString(2)+" Grade "+r2.getString(3));
//			}
			
			//deleting single row from students
//			String q3 = "delete from students where roll_number = 4";
//			smt.executeUpdate(q3);
//			java.sql.ResultSet r3 = smt.executeQuery("Select * from students");
//			while(r3.next()) {
//				System.out.println("Roll Number = "+r3.getInt(1)+" Name = "+r3.getString(2));
//			}
			
			
//			String selectQuery = "SELECT * FROM students";
//			String updateQuery = "update students set grade = 'A' where grade = 'B'";
//			String deleteQuery = "delete from students where roll_number = 4";
			
			// execute(String sql) is useful when you are unsure whether the SQL statement will return a result set or update count.
//            boolean hasResultSet = smt.execute(selectQuery);
//            if (hasResultSet) {
//                // If true, the query returned a ResultSet
//                try (java.sql.ResultSet rs = smt.getResultSet()) {
//                    while (rs.next()) {
//                        System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString("name"));
//                    }
//                }
//            } else {
//                // If false, the query is an update statement (INSERT, UPDATE, DELETE)
//                int updateCount = smt.getUpdateCount();
//                System.out.println("Rows affected: " + updateCount);
//            }
			
			//batch statement
//			String a1 = "insert into students(roll_number,name,grade) values(4,'Vijay','B'),(5,'Dinesh','B'),(6,'Vijaya','B'),(7,'Vinod','B'),(8,'Viraj','B')";
//			smt.addBatch(a1);
//			String a2 = "update students set grade = 'A' where grade = 'B'";
//			smt.addBatch(a2);
//			String a3 = "delete from students where roll_number = 8";
//			smt.addBatch(a3);
//			
//			String errorTest = "insert into students(roll_number,name,grade) values(4,'Vijay','B')";
//			smt.addBatch(errorTest);
			
//			int arr[] = smt.executeBatch();
//			
//			for(int i : arr) {
//				if (i == Statement.EXECUTE_FAILED) {
//                    System.out.println("Statement failed to execute.");
//                } else {
//                    System.out.println("Rows affected: " + i);
//                }
//				System.out.println();
//			}
			
//			java.sql.ResultSet r4 = smt.executeQuery("select * from students");
//			while(r4.next()) {
//				System.out.println("Roll Number = "+r4.getInt(1)+" Name = "+r4.getString(2)+" Grade = "+r4.getString(3));
//			}
		}
		catch (BatchUpdateException e) {
		    System.out.println("Error executing batch. Update counts:");
		    int arr[] = e.getUpdateCounts();
		    for (int i : arr) {
		        System.out.println(i);
		    }
		    e.getMessage();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
