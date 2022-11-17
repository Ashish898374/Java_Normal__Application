package static_nonStatic;

public class NonStatic {
	static {
		System.out.println("static method");   
	}
       public NonStatic() {
    	   System.out.println("Constructer function");
	}
	public void funA() {
		System.out.println("Nonstatic method");
	}
	public static void main(String[] args) {
		System.out.println("main metho");
		NonStatic n1=new NonStatic();
		n1.funA();
		
		
		// method ko call karne per all method run hoga 
		// sabse pahle static method run karega usake bad main method run hoga vapas 
		// constructer method last me non static method run karega;
	}
	

}
