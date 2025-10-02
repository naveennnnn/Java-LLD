import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.time.LocalTime;
public class Client {
    public static void main(String []args){
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        int arr[] = {12,90,89,88,34,544,32,56,84,23,45,67,78};
        int optimalThreads = Math.min(Runtime.getRuntime().availableProcessors(),13);
ExecutorService es = Executors.newFixedThreadPool(optimalThreads);
        // ExecutorService es = Executors.newFixedThreadPool(12);
        MergeSort ms = new MergeSort(arr, es);
        Future<int[]> future = es.submit(ms);
        try{
            int sorted[] = future.get();
            for(int num: sorted){
                System.out.print(num + " ");
            }
        }catch(Exception e){    
            e.printStackTrace();
        }finally{
            es.shutdown();
        }
        LocalTime currentTime1 = LocalTime.now();
        System.out.println("Current Time: " + currentTime1);
    }
}
