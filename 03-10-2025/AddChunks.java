import java.util.concurrent.Callable;
public class AddChunks implements Callable<Long>{
    private int i;
    private int j;
    private int arr[];
    private long sum = 0;

    public AddChunks(int i, int j, int arr[]) {
        this.i = i;
        this.j = j;
        this.arr = arr;
    }

    public Long call() throws Exception {
        for(int k = i; k < j; k++) {
            sum += arr[k];
        }
        return sum;
    }
}
