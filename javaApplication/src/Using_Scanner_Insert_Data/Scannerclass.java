package Using_Scanner_Insert_Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Scannerclass {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Roll :");
		int id1= sc.nextInt();
		
		System.out.println("Enter Name :");
		String name= sc.next();
		
		System.out.println("Enter class :");
		int classa= sc.nextInt();
		
		System.out.println("enter sectction");
		String section=sc.next();
		System.out.println("enter id number");
		
		int id=sc.nextInt();
		
		
		
		
		
		
		//Loading the Driver related main class into the memory
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		String url = "jdbc:mysql://localhost:3306/students";
		
		
		try (Connection conn=  DriverManager.getConnection(url,"root","Ashish@8983")){
			
			
			Statement st= conn.createStatement();
			
			int x= st.executeUpdate("insert into students values("+id1+",'"+name+"',"+classa+",'"+section+"',"+id+")");
			
			if(x > 0)
				System.out.println(x+" recored inserted sucessfully..!");
			else
				System.out.println("insertion fails..");
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
