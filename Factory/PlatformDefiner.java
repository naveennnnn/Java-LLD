package Factory;

import Factory.Components.AndroidUIFactory;
import Factory.Components.IosUIFactory;
import Factory.Components.UIFactory;

public class PlatformDefiner {
    public static UIFactory getFactory(String platform){
        switch (platform) {
            case "IOS":
                return new IosUIFactory();

            case "Android":
                return new AndroidUIFactory();
            default:
                return null;
        }
    }
}
