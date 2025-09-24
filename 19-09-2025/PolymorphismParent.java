public class PolymorphismParent {
    public String name;
    public int age = 30;
    // public void login(){
    //     System.out.println("Parent Login");
    // }
    public int login(int val){ // method overloading(compile time polymorphism / static polymorphism / early binding)
        System.out.println("Parent Login with val: "+val);
        return age;
    }
    public void getName(){
        System.out.println("Parent Name: "+name);
    }
}
