public class Clothing extends Item {
    private int size;
    public Clothing(int id, String name, int price, int quantity, int size) {
        super(id,name,price,quantity);
        this.size = size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
}
