package com.tns.jdbcprog;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
		         // Step 1: Allocate a database 'Connection' object
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_c2tc","root","Moufeeka@30");  // for MySQL only
		 
		         // Step 2: Allocate a 'Statement' object in the Connection
		         Statement stmt = conn.createStatement();
		      ) {
		         // Step 3 & 4: Execute a SQL UPDATE via executeUpdate()
		         //   which returns an int indicating the number of rows affected.
		         // Increase the price by 7% and qty by 1 for id=2
		         String strUpdate = "update book set price = price*2, quantity = quantity+1 where book_id = 101";
		         System.out.println("The SQL statement is: " + strUpdate + "\n");  // Echo for debugging
		         int countUpdated = stmt.executeUpdate(strUpdate);
		         System.out.println(countUpdated + " records affected.\n");
		 
		         // Step 3 & 4 (again): Issue a SELECT (via executeQuery()) to check the UPDATE.
		         String strSelect = "select * from book where id = 102";
		         System.out.println("The SQL statement is: " + strSelect + "\n");  // Echo for debugging
		         ResultSet rset = stmt.executeQuery(strSelect);
		         while(rset.next()) {   // Move the cursor to the next row
		            System.out.println(rset.getInt("book_id") + ", "
		                    //+ rset.getString("author") + ", "
		                    + rset.getString("title") + ", "
		                    + rset.getDouble("price") + ", "
		                    + rset.getInt("quantity"));
		         }
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }  // Step 5: Close conn and stmt - Done automatically by try-with-resources
		   }
	}