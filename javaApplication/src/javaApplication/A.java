package javaApplication;

public class A {
	
	static{
		System.out.println("static method");
	}
	{
		System.out.println("block!");
	}
	public A() {
		System.out.println("constructure!");
	}
	public void funA() {
		System.out.println("inside method!");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		A s=new A();
		s.funA();
	}

}
