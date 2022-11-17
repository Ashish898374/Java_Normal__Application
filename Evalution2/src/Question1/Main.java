package Question1;

public class Main {
	public static void main(String[] args) {
		First First1 = new First();
		second second1 = new second();
		ThreadFirst t1 = new ThreadFirst(First1, second1);
		ThreadSecond t2 = new ThreadSecond(First1, second1);
		t1.start();
		t2.start();
		}
	}

