package Question2;

public class main {
	  public static void main(String[] args) {
	        Demo m = new Demo();

	        m.start();
	        synchronized (m) {
	            try {
	                m.wait();
	            } catch (InterruptedException e) {
	                System.out.println("gii");
	            }
	            System.out.println("The Product is :"+m.sum);
	        }
	    }

}
