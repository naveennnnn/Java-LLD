/*
 * There cannot be an object of abstract class
 * There cannot be a constructor of abstract class
 * Abstract class can have abstract methods and non-abstract methods
 */

public abstract class AbstractA {
    public int x = 10;
    public abstract void test1();
    public void test2(){
        System.out.println("Test2 method");
    }
}
