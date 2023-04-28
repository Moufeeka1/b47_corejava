package com.tns.jdbcprog;

import java.sql.*;

import javax.sql.*;
import java.sql.DriverManager;

@SuppressWarnings("unused")
public class SelectJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_c2tc";
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_c2tc","root", "Moufeeka@30");
			Statement st=conn.createStatement();// create a statement
			String  str=" select book_id,title,price,quantity from book";
			System.out.println("the sql Statement is"+str+"\n");
			ResultSet rset=st.executeQuery(str);
			
			System.out.println("the records are");
			int rowCount=0;
			while(rset.next()) {
				int book_id=rset.getInt("book_id");
				String title=rset.getString("title");
				int price=rset.getInt("price");
				int quantity=rset.getInt("quantity");
				System.out.println(book_id+" "+title+" ,"+ price+ " " + quantity);
				++rowCount;
			}
		
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}