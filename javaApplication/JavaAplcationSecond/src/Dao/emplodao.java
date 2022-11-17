package Dao;

import Moduleses.emplo;

public interface emplodao {
	public String insertstudentsDetails(int id1,String name,int age,String depart);
	
	public String insertemploDetails2(emplo Student);
	public int getageByid1(int id1);

}
