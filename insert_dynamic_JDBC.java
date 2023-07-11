package Jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
public class insert_dynamic_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER NAME :");
			String name=br.readLine();
			
			System.out.println("ENTER CITY :");
			String city=br.readLine();
			
			
			
			
			//set values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			
			System.out.println("inserted......");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
