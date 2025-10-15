public class Electronics extends Item {
    private int Warranty;
    public Electronics(int id, String name, int price, int quantity, int Warranty) {
        super(id,name,price,quantity);
        this.Warranty = Warranty;
    }
    public int getWarranty(){
        return this.Warranty;
    }
}
