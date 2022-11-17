package QUESTION3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable[] jobs = {
                new MyCallable(4),
                new MyCallable(10),
                new MyCallable(2),
                new MyCallable(6),
                new MyCallable(5)
        };

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (MyCallable job: jobs) {
            Future out = service.submit(job);

            System.out.println(out.get());
        }

        service.shutdown();
    }
}
