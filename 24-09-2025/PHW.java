public class PHW implements Runnable{
    @Override
    public void run() {
        Print();
    }
    public void Print(){
        System.out.println("Public Health Worker is working");
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
}
