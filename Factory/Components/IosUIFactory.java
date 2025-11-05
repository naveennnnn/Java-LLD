package Factory.Components;

public class IosUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        System.out.println("Creating iOS Button");
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        System.out.println("Creating iOS Menu");
        return new IosMenu();
    }
    
}
