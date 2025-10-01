public class NumberPrinter implements Runnable{
    private int i;
    NumberPrinter(int i){
        this.i=i;
    }
    @Override
    public void run(){
        Print();
    }
    private void Print(){
        System.out.println("Number is :"+i+" Thread name:"+Thread.currentThread().getName());
    }
}
