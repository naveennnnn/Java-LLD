package Factory.Components;

public class IosButton implements Button{

    @Override
    public void changeSize() {
        System.out.println("Changed Size in iOS Button");
    }

    @Override
    public void changeColor() {
        System.out.println("Changed Color in iOS Button");
    }
    
}
