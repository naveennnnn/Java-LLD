import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Client1 {
    public static void main(String []args) throws Exception{
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        AddChunks a1 = new AddChunks(0,4,arr);
        AddChunks a2 = new AddChunks(5,9,arr);
        AddChunks a3 = new AddChunks(10,14,arr);
        AddChunks a4 = new AddChunks(15,19,arr);
        ExecutorService es1 = Executors.newFixedThreadPool(4);
        Future<Long> f1 = es1.submit(a1);
        Future<Long> f2 = es1.submit(a2);
        Future<Long> f3 = es1.submit(a3);
        Future<Long> f4 = es1.submit(a4);
        long sum = 0;
        sum += f1.get();
        sum += f2.get();
        sum += f3.get();
        sum += f4.get();
        System.out.println(sum);
        es1.shutdown();
    }
}
