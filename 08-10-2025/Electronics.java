public class Electronics extends Item {
    public int Warranty;
    public Electronics(int id, String name, int price, int quantity, int Warranty) {
        super(id,name,price,quantity);
        this.Warranty = Warranty;
    }
}
