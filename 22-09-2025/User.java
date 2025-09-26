public abstract class User {
    private String name;
    private int id;
    private String contactInfo;
    private static  int idInitializer = 1;
    public User(String name,String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
        this.id = generateId();
    }
    public User(){
        this.id = generateId();
    }
    private int generateId(){
        return ++idInitializer;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public String getContactInfo(){
        return this.contactInfo;
    }
    public abstract void displayDashboards();
    public abstract boolean canBorrowBooks();
}
