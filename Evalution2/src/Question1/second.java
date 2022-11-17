package Question1;

public class second {
	public synchronized void funsecond(First First1){
		System.out.println("funsecond of B method");
		First1.fun1();
		System.out.println("funsecond of B method");
		}
	
		public synchronized void fun2(){
		System.out.println("inside fun2 of second");
		}


}
