public class Books extends Item {
    private Strign author;
    public Books(int id, String name, int price, int quantity, String author) {
        super(id,name,price,quantity);
        this.author = author;
    }
    public getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }    
}
