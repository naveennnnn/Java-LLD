public class Inventory<T extends Item>{
    private ListNode<T> head,tail;
    private Map<String,T> items;
    private int recentlyViewedCapacity;
    private int size;
    public Inventory(){
        this.items = new HashMap<>();
        this.recentlyViewedCapacity = 5;
        head = new ListNode<Inventory.T>(null);
        tail = new ListNode<Inventory.T>(null);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    public void addItem(T item){
        items.put(item.getId(),item);
        addRecentlyViewedItem(item);
    }
    public void remove(String id){
        items.remove(id);
    }
    public List<T> getAllItems(){
        return new ArrayList<>(items.values());
    }
    public T addRecentlyViewedItem(T item){
        // Logic to add item to recently viewed list
        ListNode<T> newNode = new ListNode<>(item);
        newNode.next = head.next;
        head = newNode;
        size++;
        if(size > recentlyViewedCapacity){
            // remove last node
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

}
