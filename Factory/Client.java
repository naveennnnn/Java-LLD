package Factory;

import Factory.Components.Button;
import Factory.Components.Menu;
import Factory.Components.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uifactory = flutter.getFactory("Android");
        Button ibutton = uifactory.createButton();
        Menu imenu = uifactory.createMenu();

        ibutton.changeColor();
        ibutton.changeSize();
        imenu.createMenu();
        imenu.addListToMenu();
    }
    
}
