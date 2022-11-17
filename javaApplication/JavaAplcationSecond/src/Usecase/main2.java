package Usecase;

import java.util.Scanner;

import Dao.emplodao;
import Dao.emplodaoIml;
import Moduleses.emplo;

public class main2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id1");
		int id1=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter depart");
		String depart=sc.next();
		emplodao  dd=new emplodaoIml();
		String bk=dd.insertstudentsDetails(id1, name, age, depart);
		System.out.println(bk);
		
		// add data
		
		
		
		
		
		
	}

}
