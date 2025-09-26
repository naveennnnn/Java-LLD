public class PolymorphismChild extends PolymorphismParent {
    public float psp;
    private int age=10;
    @Override // required as a best practices.Throws error if method signature is not matching with parent class.
    public void login(int val){
        System.out.println("Child Login");
        System.out.println("Age: "+val); // can be access
    }
    public void login(String name){
        System.out.println("Child Login with name: "+name);
    }
    public void getPsp(){
        System.out.println("Child PSP: "+psp);
    }
}
