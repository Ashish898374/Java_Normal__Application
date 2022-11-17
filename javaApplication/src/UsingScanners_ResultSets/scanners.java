package UsingScanners_ResultSets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class scanners {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter emplo: age");
		int age=scanner.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/students";
		try  (Connection c=DriverManager.getConnection(url, "root", "Ashish@8983")){
			PreparedStatement pt=c.prepareStatement("select * from emplo where age=?");
			pt.setInt(1, age);
			ResultSet r=pt.executeQuery();
			if(r.next()) {
				int id=r.getInt("id1");
				String name=r.getString("name");
				int ag=r.getInt("age");
				String dep=r.getString("depart");
				System.out.println("emplo:"+id);
				System.out.println("emplo name:"+name);
				System.out.println("emplo age"+ag);
				System.out.println("emplo depart:"+dep);
				
			}
			else {
				System.out.println("no record found");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
