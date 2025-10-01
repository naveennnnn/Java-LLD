import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Client {
    public static void main(String[] args) {
        // PHW p = new PHW();
        // System.out.println("Main thread name:"+Thread.currentThread().getName());
        // Thread t = new Thread(p);
        // t.start();
        // // Bad way of creating threads
        // for(int i = 1;i<=100;i++){
        //     NumberPrinter np = new NumberPrinter(i);
        //     Thread t1 = new Thread(np); // Not efficient because it might create 100 new threads which will overload the CPU
        //     t1.start();
        // }
        // System.out.println("Main thread name1:"+Thread.currentThread().getName());


        // Production way to create threads
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i = 1;i<=100;i++){
            // NumberPrinter np = new NumberPrinter(i);
            // es.submit(np);
            es.submit(new NumberPrinter(i));
        }
        ExecutorService es1 = Executors.newCachedThreadPool(); // Doesnt have fixed number of threads, it will create new threads as per the need
    }
}
