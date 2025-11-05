package Factory.Components;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        System.out.println("Creating Android Button");
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        System.out.println("Creating Android Menu");
        return new AndroidMenu();
    }
    
}
