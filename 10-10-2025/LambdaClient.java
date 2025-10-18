import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class LambdaClient {
    public static void main(String[] args) {

        Consumer<String> cons1 = new Consumer<>(){
            @Override
            public void accept(String s){
                System.out.println("Hello "+s);
            }
        };
        cons1.accept("Kamal"); // Anonymous class
        cons1.accept("Naveen");


        String x = "Naveen";
        Consumer<String> cons = (s) ->{
            System.out.println("Hello "+s);
        };
        cons.accept(x); // Lambda expression
        cons.accept("Kamal");


        BinaryOperator<Integer> binOp = (p,q)->{
            return p+q;
        };

        System.out.println(binOp.apply(10,20));


        BinaryOperator<String> binOp1 = (p,q)->{
            return p+" "+q;
        };

        System.out.println(binOp1.apply("Naveen","Kamal"));

        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i = 0;i<10;i++){
            Runnable r = () ->{
                System.out.println("Thread Name is :"+Thread.currentThread().getName());
            };
            es.submit(r);
            es.submit(()->System.out.println("The THread inside lambda:"+Thread.currentThread().getName()));


            List<Integer> ls1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            List<Integer> lsStream = ls1.stream().filter(y->y>5).toList();
            List<Integer> ls1Increament = ls1.stream().map(a->a+2).toList();
            
        }
    }
}
