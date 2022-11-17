package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.util.Util;

import DButily.Utility;
import Moduleses.emplo;

public class emplodaoIml implements emplodao {

	@Override
	public String insertstudentsDetails(int id1, String name, int age, String depart) {
		// TODO Auto-generated method stub
		String masage="Not add";
		try (	Connection con=Utility.provideConnection()){
			PreparedStatement pt=con.prepareStatement("insert into emplo values(?,?,?,?)");
			pt.setInt(1, age);
			pt.setString(2, name);
			pt.setInt(3, age);
			pt.setString(4, depart);
			int x=pt.executeUpdate();
			if(x>0) {
				masage="add suceesfully";
			}
		} catch (SQLException e) {
			 masage=e.getMessage();
		}
		return masage;
	}

	
	@Override
	public String insertemploDetails2(emplo Student) {
		
	String message = "Not Inserted...";
		
		
		try (Connection conn= Utility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into emplo values(?,?,?,?)");
			
			
			ps.setInt(1, Student.getId1());
			ps.setString(2, Student.getName());
			ps.setInt(3, Student.getAge());
			ps.setLong(4, Student.getDepart());
			
			int x=  ps.executeUpdate();
			
			
			if(x > 0)
				message = "Record Inserted Successfully..";
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		
		return message;
		
	}



	@Override
	public int getageByid1(int id1) {
	
		int age = -1;
		
		
		try (Connection conn= Utility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select age from emplo where id1 = ?");
			
			ps.setInt(1, id1);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				age= rs.getInt("age");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return age;
		
	}


	
}

	
	

