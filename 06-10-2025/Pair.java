public class Pair<T,V>{
    private T first;
    private V second;
    private int count;
    public void setFirst(T f){
        first = f;
    }
    public void setSecond(V s){
        second = s;
    }
    public void setCount(int c){
        count = c;
    }

    // Generic methods
    public T getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
    public int getCount(){
        return count;
    }

    public static <T,R> R something(T someVar, R currSomething){ // This <T> can/cannot be different from the class<T>
        System.out.println("Some Variable "+someVar);
        return currSomething;
    }
}