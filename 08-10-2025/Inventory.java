import java.util.*;
public class Inventory<T extends Item>{
    private Map<Integer,T> items;
    private ListNode<T> head,tail;
    private int recentlyViewedCapacity;
    private int size;
    public Inventory(){
        this.items = new HashMap<>();
        this.recentlyViewedCapacity = 5;
        head = new ListNode<T>(null);
        tail = new ListNode<T>(null);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    public void addItem(T item){
        items.put(item.getId(),item);
        addRecentlyViewedItem(item);
    }
    public void remove(int id){
        items.remove(id);
    }
    public List<T> getAllItems(){
        return new ArrayList<>(items.values());
    }
    public void addRecentlyViewedItem(T item){
        // Logic to add item to recently viewed list
        ListNode<T> newNode = new ListNode<>(item);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        if(size > recentlyViewedCapacity){
            // remove last node
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }
    public List<T> getRecentlyViewed(){
        List<T> recentlyViewed = new ArrayList<>();
        ListNode<T> curr = head.next;
        while(curr != tail){
            recentlyViewed.add(curr.getData());
            curr = curr.next;
        }
        return recentlyViewed;
    }
}
