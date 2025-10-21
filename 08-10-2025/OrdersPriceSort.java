import java.util.Comparator;
public class OrdersPriceSort implements Comparator<Orders> {

    @Override
    public int compare(Orders o1, Orders o2) {
        Long price1 = 0l;
        Long price2 = 0l;
        for(Item i:o1.getItems()){
            price1 += i.getPrice()*i.getQuantity();
        }
        for(Item i:o2.getItems()){
            price2 += i.getPrice()*i.getQuantity();
        }
        return Long.compare(price1,price2);
    }
    
}
