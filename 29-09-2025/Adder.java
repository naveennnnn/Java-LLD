import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    public Count count;
    private Lock l;
    public Adder(Count count, Lock lock){
        this.count = count;
        this.l = lock;
    }
    @Override
    public void run(){
        synchronized(count){
            for(int i=0;i<10000;i++){
                this.count.add(i);
            }
        }
        // l.lock();
        // for(int i=0;i<10000;i++){
        //     this.count.add(i);
        // }
        // l.unlock();
        
        
    }
}
