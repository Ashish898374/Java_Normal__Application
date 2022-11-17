package Question1;

public class ThreadFirst  extends Thread{
	First First1;
	second second1;
	public ThreadFirst(First First1,second second1) {
	First1.funFirst(second1);
	}


}
