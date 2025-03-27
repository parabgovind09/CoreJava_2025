package com.home.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
The object of ResultSet maintains a cursor pointing to a row of a table. Initially, cursor points to before the first row.

By default, ResultSet object can be moved forward only and it is not updatable.

But we can make this object to move forward and backward direction by passing either TYPE_SCROLL_INSENSITIVE or TYPE_SCROLL_SENSITIVE in createStatement(int,int) method as well as we can make this object as updatable by:

Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);  


 */
public class ResultSet {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
//			Statement smt = con.createStatement();
//			String q1 = "Select * from students";
//			java.sql.ResultSet r1 = smt.executeQuery(q1);
//			while(r1.next()) {
//				System.out.println("Roll Number = "+r1.getInt(1)+" Name = "+r1.getString(2)+" Grade = "+r1.getString(3));
//			}
			Statement smt=con.createStatement(java.sql.ResultSet.TYPE_SCROLL_SENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE); 
//			smt.executeUpdate("insert into students (roll_number,name,grade) values(7,'vijaya','B')");
			java.sql.ResultSet r = smt.executeQuery("select * from students");
			/* 
			 * absolute()
			 * Moves the cursor to the given row
			 * number inthis ResultSet object. If the row number is positive, the cursor
			 * moves tothe given row number with respect to thebeginning of the result set.
			 * The first row is row 1, the secondis row 2, and so on.
			 * 
			 * If the given row number is negative, the cursor moves toan absolute row
			 * position with respect tothe end of the result set. For example, calling the
			 * method absolute(-1) positions thecursor on the last row; calling the method
			 * absolute(-2)moves the cursor to the next-to-last row, and so on.
			 * 
			 * If the row number specified is zero, the cursor is moved tobefore the first
			 * row.
			 * 
			 * An attempt to position the cursor beyond the first/last row inthe result set
			 * leaves the cursor before the first row or afterthe last row.
			 * 
			 * Note: Calling absolute(1) is the sameas calling first(). Calling
			 * absolute(-1)is the same as calling last().
			 */
			r.absolute(4);
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			
			/*
			 * relative()
			 * Moves the cursor a relative number of rows, either positive or negative.
			 * Attempting to move beyond the first/last row in the result set positions the cursor before/after thethe first/last row. 
			 * Calling relative(0) is valid, but does not change the cursor position. 
               Note: Calling the method relative(1)is identical to calling the method next() and calling the method relative(-1) is identicalto calling the method previous().
			 */
			r.relative(-3);//since cursor at 4 and now 4-3 = 1
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			r.relative(5);//1+5=6
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			
			r.next();//6+1=7
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			r.previous();//7-1=6
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			
			r.first();//1
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			r.last();//7
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			
			System.out.println(r.findColumn("name"));
			r.absolute(6);//changing vijaya to java at row 6
			/*
			 * Updates the designated column with a String value.The updater methods are used to update column values in thecurrent row or the insert row. 
			 * The updater methods do notupdate the underlying database; instead the updateRow or insertRow methods are called to update the database.
			 */
			r.updateString(2,"Jaya");
			r.updateRow();//now it update in underlying database
			System.out.println("Roll Number = "+r.getInt(1)+" Name = "+r.getString(2)+" Grade = "+r.getString(3));
			
			//deleting the last row
//			r.last();
//			r.deleteRow();
			
			r.absolute(4);
			System.out.println(r.getMetaData());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
