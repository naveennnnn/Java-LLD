import java.util.*;
public class Orders implements Comparable<Orders>{
    private String orderId;
    private Boolean isExpress;
    private List<Item> items;
    
    public Orders(String orderId, Boolean isExpress,List<Item> items) {
        this.orderId = orderId;
        this.isExpress = isExpress;
        this.items = items;
    }

    public String getOrder_id() {
        return orderId;
    }
    public void setOrder_id(String orderId) {
        this.orderId = orderId;
    }
    public Boolean getIsExpress() {
        return isExpress;
    }
    public void setIsExpress(Boolean isExpress) {
        this.isExpress = isExpress;
    }

    @Override
    public int compareTo(Orders o) {
        if(this.isExpress == o.isExpress){
            return this.orderId.compareTo(o.orderId);
        }
        else if(this.isExpress){
            return -1;
        }
        else{
            return 1;
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Item> getItems() {
        return items;
    }
}
