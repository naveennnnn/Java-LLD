public abstract class User1 {
    public String name;
    int age;
    private int id;
    User1(){
        System.out.println("User constructor called without params");
    } // called if no super() is called in the child class
    User1(String name){
        System.out.println("User constructor called with name");
        this.name = name;
    }
    User1(String name, int age){ // super is required to call this from child classes
        System.out.println("User constructor called with both");
        this.name = name;
        this.age = age;
    }
    void login(){
        System.out.println(name +" logged in");
    }
    void logout(){
        System.out.println(name + " Logged out");
    }
}

