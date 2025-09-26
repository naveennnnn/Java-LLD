public class Student extends Member{
    public Student(){
        super(); // Call parent constructor
        borrowedBooksLimit = 5;
    }
    public Student(String name, String contactInfo){
        super(name,contactInfo); // Call parent constructor
        borrowedBooksLimit = 5;
    }
    
    @Override
    public void displayDashboards() {
        System.out.println("Student Dashboard");
    }
}
