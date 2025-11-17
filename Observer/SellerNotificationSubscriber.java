package Observer;

public class SellerNotificationSubscriber implements Subscriber{

    @Override
    public void OnOrderPalced(OrderType type) {
        System.out.println("Seller Notified for type: "+type.type);
    }
    
}
