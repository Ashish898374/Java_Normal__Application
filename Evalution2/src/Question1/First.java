package Question1;

public class First {
	
	public synchronized void funFirst(second second1){  // 
		System.out.println("funFirst of First method");
		second1.fun2();
		System.out.println("funFirst of First method");
		}
		public synchronized void fun1(){
		System.out.println("inside fun1 of First");
		}


}
