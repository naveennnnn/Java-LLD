public class SingleDataTypePair<T> {
    private T first;
    private T second;
    public void setFirst(T f){
        first = f;
    }
    public void setSecond(T s){
        second = s;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
}
