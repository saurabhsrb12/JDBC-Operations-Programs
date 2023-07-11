package Jdbc_conn;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class first_jdbc {

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
				
				if(con.isClosed())
				{
					System.out.print("closed");
				}else {
					System.out.print("connection created");
					
				}
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
