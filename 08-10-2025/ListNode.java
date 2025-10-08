public class ListNode<T> {
    public ListNode <T> next;
    public LsitNode <T> prev;
    private T data;
    public ListNode(T d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }

    public T getData(){
        return this.data;
    }
}
