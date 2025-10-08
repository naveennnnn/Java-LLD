import java.util.*;
import java.util.concurrent.Semaphore;
public class Producer implements Runnable{
    Queue<Object> q;
    int maxSize;
    Semaphore pSemaphore;
    Semaphore cSemaphore;
    public Producer(Queue<Object> q,int size,Semaphore p,Semaphore c){
        this.q = q;
        this.maxSize = size;
        this.pSemaphore = p;
        this.cSemaphore = c;
    }
    @Override 
    public void run(){
        while(true){
            try{
                pSemaphore.acquire();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            synchronized(q){
                if(q.size()<maxSize){
                    q.add(new Object());
                    System.out.println("Producer Thread Name: "+Thread.currentThread().getName()+" q size = "+q.size());
                }
            }
            cSemaphore.release();
        }
    }
}
