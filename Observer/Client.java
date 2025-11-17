package Observer;
/*
 * Observer dp is similar to pub sub model.
 */
public class Client {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        // OrderType primeOrder = new OrderType("PRIME");
        OrderType primeOrder = new OrderType("Normal");
        CustomerNotificationSubscriber cns = new CustomerNotificationSubscriber();
        SellerNotificationSubscriber sns = new SellerNotificationSubscriber();
        DeliveryOptionsSubscriber dos = new DeliveryOptionsSubscriber();

        amazon.registerSubscriber(cns);
        amazon.registerSubscriber(sns);
        amazon.registerSubscriber(dos);
        amazon.OnOrderPlaced(primeOrder);
    }
}
