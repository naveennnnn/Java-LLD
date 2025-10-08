import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.*;
public class ProducerConsumerClient {
    public static void main(String[] args) {
        Queue<Object> q = new ArrayDeque<>();
        int maxSize = 5;
        // ExecutorService es = Executors.newFixedThreadPool(5);
        Semaphore pSemaphore = new Semaphore(5);
        Semaphore cSemaphore = new Semaphore(0);
        Producer p1 = new Producer(q,maxSize,pSemaphore,cSemaphore);
        Producer p2 = new Producer(q,maxSize,pSemaphore,cSemaphore);
        Producer p3 = new Producer(q,maxSize,pSemaphore,cSemaphore);
        Producer p4 = new Producer(q,maxSize,pSemaphore,cSemaphore);
        Consumer c1 = new Consumer(q,maxSize,pSemaphore,cSemaphore);
        Consumer c2 = new Consumer(q,maxSize,pSemaphore,cSemaphore);
        Consumer c3 = new Consumer(q,maxSize,pSemaphore,cSemaphore);
        Consumer c4 = new Consumer(q,maxSize,pSemaphore,cSemaphore);
        Consumer c5 = new Consumer(q,maxSize,pSemaphore,cSemaphore);
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(p4);
        t4.start();

        Thread t5 = new Thread(c1);
        t5.start();
        Thread t6 = new Thread(c2);
        t6.start();
        Thread t7 = new Thread(c3);
        t7.start();
        Thread t8 = new Thread(c4);
        t8.start();
        Thread t9 = new Thread(c5);
        t9.start();
    }   
}
