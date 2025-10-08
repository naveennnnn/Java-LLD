import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.*;

public class AddChunksClient {
    public static void main(String []args) throws Exception{
        int nCores = Runtime.getRuntime().availableProcessors();
        int arr[] = new int[1000];
        long sum = 0;
        int i = 0;
        Random rand = new Random();
        for(int k=0;k<1000;k++){
            arr[i++] = rand.nextInt(1000);
        }
        System.out.println("Number of cores: "+nCores);
        List<Future<Long>> futures = new ArrayList<>();
        ExecutorService es1 = Executors.newFixedThreadPool(nCores);
        for(int j = 0;j<nCores;j++){
            int start = j*(1000/nCores);
            int end = start+(1000/nCores);
            Callable<Long> adder = new AddChunks(start,end,arr);
            Future<Long> future = es1.submit(adder);
            futures.add(future);
        }
        for(Future<Long> m:futures){
            sum += m.get();
        }
        System.out.println(sum);
        es1.shutdown();
    }
}
