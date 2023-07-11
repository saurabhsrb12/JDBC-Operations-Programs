package Jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert_data_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

///insert from prepared statement===========================================================================
		
		try {
			
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create a connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			//creating a query
			String q="insert into table1(tName,tCity) values (?,?)";
			
			//get the Prepared Statement Object
			PreparedStatement pstmt= con.prepareStatement(q);
			
			//set values to query
			pstmt.setString(1, "John");
			pstmt.setString(2, "Dubai");
			
			pstmt.executeUpdate();
			
			System.out.println("inserted......");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
















