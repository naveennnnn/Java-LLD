public class User {
    String name;
    int age;
    User(){
        System.out.println("User constructor called without params");
    } // called if no super() is called in the child class
    User(String name){
        System.out.println("User constructor called with name");
        this.name = name;
    }
    User(String name, int age){ // super is required to call this from child classes
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

