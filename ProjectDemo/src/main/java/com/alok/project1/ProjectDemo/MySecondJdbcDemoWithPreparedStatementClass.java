package com.alok.project1.ProjectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySecondJdbcDemoWithPreparedStatementClass {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);
    	PreparedStatement preparedStatement=null;
    	
    	
    	try(
    			Connection connection=
    			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbdemo1",
    					"root", 
    					"rootalok");
    			) {
//          1. Connect
//        	1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Enter Employee ID : ");
			String id=scanner.next();
		
			
//			2. Query
			preparedStatement=connection.prepareStatement("DELETE FROM EMPLOYEE WHERE id = (?)");
			
			preparedStatement.setString(1, id);
			int rows=preparedStatement.executeUpdate();
			
//			3. Process Result
			if(rows>0)
				System.out.println("Employee Deleted!");
			else {
				System.out.println("No emplyee found with that id");
			}
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Employee Not deleted!");
		}
    	
    }
}
