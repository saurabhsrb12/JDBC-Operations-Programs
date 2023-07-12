package com.jdbc.practice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class select_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=connectionProvider.getConnection();
			
			String q="Select * from table1 ";
			
			Statement stmt= con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				
				int id =set.getInt(1);
				String name  =set.getString(2);
				String city =set.getString(3);
				
				System.out.println("ID :"+id + "__NAME :"+name + "__CITY :"+city );
				
				//System.out.println(id +name + city);
			}
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
		
		
		

	}

}
