package com.home.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
The PreparedStatement interface is a subinterface of Statement.
It is used to execute parameterized query.
String sql="insert into emp values(?,?,?)";  
As you can see, we are passing parameter (?) for the values. Its value will be set by calling the setter methods of PreparedStatement.
We can also use it as statements in jdbc
Improves performance: The performance of the application will be faster if you use PreparedStatement interface because query is compiled only once.

 */
public class PreparedStatement {

	public static void main(String[] args) {
		try {
			//creating a table
//			String q1 = "CREATE TABLE sells("
//					+ "pid int,"
//					+ "pname varchar(20),"
//					+ "paddress varchar(20))";
			//you can also alter table and modify the definition for that go to github repo practice_task
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
//			java.sql.PreparedStatement smt = con.prepareStatement(q1);
//			smt.executeUpdate();
//			System.out.println("Table Created Successfully");
			//insert values
//			String q2 = "insert into sells values(1,'Like Boy','Malad'),(2,'Goregaon','Pears'),(3,'Kandivali','Dettol'),(4,'Dahisar','Medemix'),(5,'Malad','Santoor')";
//			smt.addBatch(q2);
			
//			System.out.println(smt.executeBatch().toString());
			
			
			
//			java.sql.PreparedStatement smt = con.prepareStatement("insert into sells values(?,?,?)");
			/*
			 *  public void setInt(int paramIndex, int value)  sets the integer value to the given parameter index.
				public void setString(int paramIndex, String value) sets the String value to the given parameter index.
				public void setFloat(int paramIndex, float value) sets the float value to the given parameter index.
				public void setDouble(int paramIndex, double value) sets the double value to the given parameter index.
			 */
//			smt.setInt(1, 6);
//			smt.setString(2, "Borivali");
//			smt.setString(3, "Dove");
//			smt.executeUpdate();
			
//			java.sql.PreparedStatement smt = con.prepareStatement("update sells set pname = paddress  where pid not in(?)");
//			smt.setInt(1, 1);
//			smt.executeUpdate();
			
//			java.sql.PreparedStatement smt = con.prepareStatement("delete from sells where pid not in(?)");
//			smt.setInt(1, 1);
//			smt.executeUpdate();
			
//			java.sql.PreparedStatement smt = con.prepareStatement("drop table sells");
//			smt.executeUpdate();
			
//			java.sql.ResultSet r = smt.executeQuery("select * from sells");
//			while(r.next()) {
//				System.out.println("ID = "+r.getInt(1)+" Name = "+r.getString(2)+" Address = "+r.getString(3));
//			}
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
