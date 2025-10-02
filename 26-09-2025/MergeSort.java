import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<int []>{
    int [] arr;
    ExecutorService es;
    public MergeSort(int []arr, ExecutorService es){
        this.arr = arr;
        this.es = es;
    }
    @Override
    public int [] call(){
        if(arr.length<=1){
            return arr;
        }
        int mid = arr.length/2;
        int n1 = mid;
        int n2 = arr.length - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<mid;i++){
            arr1[i] = arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            arr2[i-mid] = arr[i];
        }
        MergeSort ms1 = new MergeSort(arr1, es);
        MergeSort ms2 = new MergeSort(arr2, es);
        Future<int []> f1 = es.submit(ms1);
        Future<int []> f2 = es.submit(ms2);
        int sorted1[] = null;
        int sorted2[] = null;
        try{
            sorted1 = f1.get();
            sorted2 = f2.get();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        int i = 0;
        int j = 0;
        int sorted[] = new int[arr.length];
        int k = 0;
        while(i<n1 && j<n2){
            if(sorted1[i]<=sorted2[j]){
                sorted[k++] = sorted1[i++];
            }
            else{
                sorted[k++] = sorted2[j++];
            }
        }
        while(i<n1){
            sorted[k++] = sorted1[i++];
        }
        while(j<n2){
            sorted[k++] = sorted2[j++];
        }
        System.out.println("ThreadName:"+Thread.currentThread().getName()+" Array:"+java.util.Arrays.toString(sorted));
        return sorted;
    }
}