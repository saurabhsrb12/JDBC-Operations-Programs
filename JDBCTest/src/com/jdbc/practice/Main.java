package com.jdbc.practice;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection c=connectionProvider.getConnection();
			
			
			String q="insert into images(pic) values(?)";
			
			PreparedStatement pstmt= c.prepareStatement(q);
			
			JFileChooser jfc=new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file=jfc.getSelectedFile();
			
			FileInputStream fis=new FileInputStream(file);
			
			pstmt.setBinaryStream(1,fis,fis.available());
			
			pstmt.executeUpdate();
			
			//System.out.println();
			
			
			JOptionPane.showMessageDialog(null, "success....");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
