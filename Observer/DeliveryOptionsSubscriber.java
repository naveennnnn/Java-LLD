package Observer;

public class DeliveryOptionsSubscriber implements Subscriber{
    @Override
    public void OnOrderPalced(OrderType type) {
        if(type.type == "PRIME"){
            return;
        }
        System.out.println("Delivery Options Updated for type: "+type.type);
    }
}
