package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class connectionProvider {

		private static Connection con;
		
		
		public static Connection getConnection() 
			// TODO Auto-generated method stub	
		{
		
			try 
			{
				if(con == null)
				{
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
					
				}				
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			
		
			return con;
			
		}
}
