package Observer;

public class CustomerNotificationSubscriber implements Subscriber{
    @Override
    public void OnOrderPalced(OrderType type) {
        System.out.println("Customer Notified for type: "+type.type);
    }    
}
