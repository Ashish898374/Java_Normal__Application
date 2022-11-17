package javaApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {


	public static void main(String[] args)  {
		//Loading the Driver related main class into the memory
		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Could not load the Driver main class");
				}
				

				String url = "jdbc:mysql://localhost:3306/students";
				
				try 
					(Connection conn=  DriverManager.getConnection(url,"root","Ashish@8983")){
					
				Statement  st=conn.createStatement();
				int x=st.executeUpdate("insert into students values(11,'masaiSchool',11,'B',26)");
				if(x>0)
					System.out.println(x+"sucess");
				else
					System.out.println("not add");
				}catch(SQLException e) {
					e.printStackTrace();
				}
				   
	}

}
