public class Instructor extends User1{
    public Instructor(String name,int age){
        System.out.println("Instructor constructor called");
        super(name); // If there is an constructor created in parent then this is required. This should be the first line of child constructor
        // this.name = name; // this can be used to set the values of parent attributes if 
        // this.age = age; // there is no constructor in parent
        
    }
    public void teach(){
        System.out.println(this.name + " is teaching");
    }
    public void login(){
        System.out.println(this.name + " has logged in");
    }
    public void logout(){
        System.out.println(this.name + " has logged out");
    }
}
