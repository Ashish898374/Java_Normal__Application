package Usecase;

import java.util.Scanner;

import Dao.emplodao;
import Dao.emplodaoIml;

public class ageIntemplo {
	public static void main(String[] args) {
		 Scanner  s=new Scanner(System.in);
		 System.out.println("enter id1");
		 int ages=s.nextInt();
		 emplodao  da=new emplodaoIml();
          	int rp=da.getageByid1(ages);
          	if(rp>=0) {
          		System.out.println("age is"+rp);
          	}
          	else 
          		System.out.println("data no found"+rp);
	
	}

}
