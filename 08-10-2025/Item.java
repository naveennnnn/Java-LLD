import java.util.Comparator;
public class Item implements Comparable<Item>{ // T can also be Item
    private int id;
    private String name;
    private int price;
    private int quantity;

    public Item(int id,String name,int price,int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public int compareTo(Item n){
        return this.price - n.price;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
}