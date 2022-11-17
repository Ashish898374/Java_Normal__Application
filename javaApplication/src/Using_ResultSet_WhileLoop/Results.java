package Using_ResultSet_WhileLoop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Results {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/students";
		try {
			Connection  co=DriverManager.getConnection(url, "root", "Ashish@8983");
			PreparedStatement pt= co.prepareStatement("select * from students");
		  ResultSet rs=pt.executeQuery();
		  while(rs.next()) {
			  int id=rs.getInt("id1");
			  String name=rs.getString("name");
			  int cl=rs.getInt("class");
			  String se=rs.getString("section");
			  int i=rs.getInt("id");
			  
			  System.out.println("syudents id1 is:"+id);
			  System.out.println("students name is:"+name);
			  System.out.println("students class is:"+cl);
			  System.out.println("students section is:"+se);
			  System.out.println("students id is:"+i);
			  
			  System.out.println("Thsnks you");
			  
			  
		  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
