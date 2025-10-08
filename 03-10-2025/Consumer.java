import java.util.*;
import java.util.concurrent.Semaphore;
public class Consumer implements Runnable{
    Queue<Object> q;
    int maxSize;
    Semaphore pSemaphore;
    Semaphore cSemaphore;
    public Consumer(Queue<Object> q,int size,Semaphore p,Semaphore c){
        this.q = q;
        this.maxSize = size;
        this.pSemaphore = p;
        this.cSemaphore = c;
    }
    @Override 
    public void run(){
        while(true){
            try{
                cSemaphore.acquire();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            synchronized(q){ // Maintains the lock and prevents RACE conditions
                if(q.size()>0){
                    q.remove();
                    System.out.println("Consumer Thread Name: "+Thread.currentThread().getName()+" q size = "+q.size());
                }
            }
            pSemaphore.release();
        }
    }
}
