package Usecase;

import java.util.Scanner;

import Dao.emplodaoIml;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter students id1");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter depart");
		String depart=sc.next();
		emplodaoIml d=new emplodaoIml();
		 String b= d.insertstudentsDetails(id, name, age, depart);
		 System.out.println(b);
	}

}
