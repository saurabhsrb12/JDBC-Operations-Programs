package Jdbc_conn;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert_image_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");                     			
			
			String q="insert into images(pic) values(?)";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\Downloads\\srb12.jpg");
			
			pstmt.setBinaryStream(1,fis, fis.available());
			
			pstmt.executeUpdate();
			System.out.print("IMAGE INSERTED........");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
