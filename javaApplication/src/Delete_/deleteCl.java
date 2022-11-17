package Delete_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteCl {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter update age");
		int age=s.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/Students";
		try (Connection connec= DriverManager.getConnection(url, "root", "Ashish@8983")){
			PreparedStatement ps=connec.prepareStatement("delete from students where class=?");
			ps.setInt(1, age);
			int pk=ps.executeUpdate();
			if(pk>0) {
				System.out.println(pk+"student age is deleted");
			}
			else {
				System.out.println("data not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//jo class number enter hoga vahi delete ho jayega
