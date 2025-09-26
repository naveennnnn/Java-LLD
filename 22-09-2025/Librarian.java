public class Librarian extends User{
    private String employeeId;
    private static int employeeIdInitializer = 100;
    public Librarian(){
        super(); // Call parent constructor
        this.employeeId = generateEmployeeId(); 
    }
    public Librarian(String name, String contactInfo){
        super(name,contactInfo); // Call parent constructor
        this.employeeId = generateEmployeeId(); 
    }

    @Override
    public void displayDashboards() {
        System.out.println("Librarian Dashboard");
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
    public void addNewBook(String bookName){
        System.out.println("New Book Added: "+bookName);
    }
    public void removeBook(String bookName){
        System.out.println("Book Removed: "+bookName);
    }
    public String getEmployeeId(){
        return this.employeeId;
    }
    private String generateEmployeeId(){
        return "0"+(++employeeIdInitializer);
    }
}
