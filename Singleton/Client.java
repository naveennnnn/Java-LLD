import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Client {
    public static void main(String[] args) {
        Callable<MultithreadedDbConn> c = ()->{
            return MultithreadedDbConn.getInstance();
        };
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i = 0;i<10;i++){
            Future<MultithreadedDbConn> obj = es.submit(c);
            try{
                System.out.println("Instance Address: "+obj.get());
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
