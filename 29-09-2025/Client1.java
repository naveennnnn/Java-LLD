import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client1 {
    public static void main(String []args) throws Exception{
        Lock l = new ReentrantLock();
        Count c = new Count();
        Adder a = new Adder(c,l);
        Subtractor s = new Subtractor(c,l);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
        t1.join(); // Waits until the thread t1 is completed
        t2.join();  

        System.out.println(c.getValue());
    }   
}
