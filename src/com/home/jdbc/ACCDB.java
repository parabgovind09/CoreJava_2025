package com.home.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//DSN-less Connection Using Java and UCanAccess
public class ACCDB {

    public static void main(String[] args) {
        String dbFilePath = "C:\\Users\\Govind\\eclipse-workspace\\Northwind2007.accdb";  
        String jdbcURL = "jdbc:ucanaccess://" + dbFilePath;
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            try (Connection connection = DriverManager.getConnection(jdbcURL)) {  
	            System.out.println("Connection established successfully.");  
	            
	            // Create a statement  
	            java.sql.Statement statement = connection.createStatement();  
	            
	            String query = "SELECT [Ship Name], [Ship City] FROM Orders";
	            java.sql.ResultSet resultSet = statement.executeQuery(query);  
	            
	            while (resultSet.next()) {  
	                System.out.println("Ship Name: " + resultSet.getString("Ship Name")+"\t\t\t"+"Ship City: " + resultSet.getString("Ship City"));  
	            }  
	            
	            connection.close();  
            } 
            catch (Exception e) {  
                e.printStackTrace();  
            }
        } catch (ClassNotFoundException e) {
            System.out.println("UCanAccess Driver not found. Please add it to the classpath.");
            e.printStackTrace();
        }
    }
}
