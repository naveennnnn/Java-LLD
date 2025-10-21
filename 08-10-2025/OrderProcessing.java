import java.util.*;
public class OrderProcessing {
    private Queue<Orders> orders;

    public OrderProcessing() {
        this.orders = new PriorityQueue();
    }

    public void addOrder(Orders o){
        orders.offer(o);
    }

    public Orders processOrder(){
        return orders.poll();
    }
    public Queue<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Orders> orders) {
        this.orders = orders;
    }
    

}
