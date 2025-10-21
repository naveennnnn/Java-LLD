public class ListNode<T extends Item> {
    public ListNode <T> next;
    public ListNode <T> prev;
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
