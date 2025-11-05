package Factory.Components;

public class AndroidMenu implements Menu{
    @Override
    public void createMenu() {
        System.out.println("created Menu in Android");
    }

    @Override
    public void addListToMenu() {
        System.out.println("added list to Menu in Android");
    }
}
