public class Clothing extends Item {
    private String size;
    public Clothing(int id, String name, int price, int quantity, String size) {
        super(id,name,price,quantity);
        this.size = size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return this.size;
    }
}
