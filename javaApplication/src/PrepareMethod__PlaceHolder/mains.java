package PrepareMethod__PlaceHolder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class mains {
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		System.out.println("enter id1 here");
		int id1=sca.nextInt();
		System.out.println("enter name here");
		String  name=sca.next();
		System.out.println("enter class here");
		int cl=sca.nextInt();
		System.out.println("enter section here");
		String sec=sca.next();
		System.out.println("enter id");
		int id=sca.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/students";
		try (Connection conec= DriverManager.getConnection(url, "root", "Ashish@8983")){
			PreparedStatement  pr=conec.prepareStatement("insert into students values(?,?,?,?,?)");
			pr.setInt(1, id1);
			
			pr.setString(2, name);
			
			pr.setInt(3, cl);
			
			pr.setString(4, sec);
			
			pr.setInt(5, id);
			int x=pr.executeUpdate();
			if(x>0) {
				System.out.println(x+"placeholder sucessfull");
			}
			else {
				System.out.println("not add");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
