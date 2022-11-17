package Update__data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter update class");
		int classs=s.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/students";
		
		try( Connection conn= DriverManager.getConnection(url,"root","Ashish@8983") ) {
			
			
			PreparedStatement ps= conn.prepareStatement("update students set class = class + ? where class < 40");
			
			ps.setInt(1, classs);
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				System.out.println(x+ " rocords are updated successfully");
			else
				System.out.println(" No record updated..");
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
	}

	}
}


// class <jo number dalna hai like usase jo class chota hoga vahi update hoga  
