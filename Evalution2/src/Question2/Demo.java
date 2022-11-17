package Question2;

public class Demo  extends Thread{
	int sum=1;
    @Override
    public void run() {
    synchronized (this) {
        for (int i = 1; i <= 10; i++) {
            sum = sum * i;
        }
        notify();
    }

    }

}
