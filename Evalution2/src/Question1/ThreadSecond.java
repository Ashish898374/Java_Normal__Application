package Question1;

public class ThreadSecond extends Thread {
	First First1;
	second second1;
	public ThreadSecond(First First1,second secend1) {
	this.second1=second1;
	this.First1=First1;
	}
	@Override
	public void run() {
	second1.funsecond(First1);
	}


}
