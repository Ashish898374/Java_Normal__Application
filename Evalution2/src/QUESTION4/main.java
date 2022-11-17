package QUESTION4;

public class main {
	 public static void main(String[] args) throws InterruptedException {
	        DhoniThred d=new DhoniThred();
	        KohliThread k=new KohliThread();
	        RohitThread r=new RohitThread();
	        d.setPriority(10);
	        r.setPriority(8);
	        k.setPriority(1);

	        d.start();
	        d.join();
	        r.start();
	        k.start();
	    }
}
