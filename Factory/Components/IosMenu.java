package Factory.Components;

public class IosMenu implements Menu{

    @Override
    public void createMenu() {
        System.out.println("created Menu in Ios");
    }

    @Override
    public void addListToMenu() {
        System.out.println("added list to Menu in Ios");
    }
    
}
