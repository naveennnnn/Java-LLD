public class PolymorphismParent {
    public String name;
    public int age = 30;
    // public void login(){
    //     System.out.println("Parent Login");
    // }
    public void login(int val){ // method overloading(compile time polymorphism / static polymorphism / early binding)
        System.out.println("Parent Login with val: "+val);
    }
    public void getName(){
        System.out.println("Parent Name: "+name);
    }
}
