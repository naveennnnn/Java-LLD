public class Professor extends Member{
    public Professor(){
        super(); // Call parent constructor
        borrowedBooksLimit = 10;
    }
    public Professor(String name, String contactInfo){
        super(name,contactInfo); // Call parent constructor
        borrowedBooksLimit = 10;
    }
    @Override
    public void displayDashboards() {
        System.out.println("Professor Dashboard");
    }
}
