package Jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert_table_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//create a connection
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url,username,password);
	
		//create query...........................................................
		
		String q="create table table1(tID int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400) )";	
		
		
		//create a statement.........................................................
		
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate(q);
		
		System.out.println("table created...");
		con.close();
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
