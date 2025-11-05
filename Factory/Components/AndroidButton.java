package Factory.Components;

public class AndroidButton implements Button{

    @Override
    public void changeSize() {
        System.out.println("Changed Size in Android Button");
    }

    @Override
    public void changeColor() {
        System.out.println("Changed Color in Android Button");
    }
    
}
