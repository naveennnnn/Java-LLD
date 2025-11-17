package Observer;

import java.util.ArrayList;
import java.util.List;
public class Amazon {
    public List<Subscriber> subs;
    public Amazon(){
        subs = new ArrayList<>();
    }
    public void registerSubscriber(Subscriber s){
        subs.add(s);
    }
    public void unregisterSubscriber(Subscriber s){
        subs.remove(s);
    }
    public void OnOrderPlaced(OrderType type){
        for(Subscriber s: subs){
            s.OnOrderPalced(type);
        }
    }
}
