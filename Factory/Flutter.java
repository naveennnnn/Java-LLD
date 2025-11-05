package Factory;

import Factory.Components.AndroidUIFactory;
import Factory.Components.IosUIFactory;
import Factory.Components.UIFactory;

public class Flutter {

    public void setTheme(){
        System.out.println("Setting Flutter Theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting Flutter Refresh Rate");
    }

    // public UIFactory getFactory(String platform){ // These Methods doesnt belong to Flutter as it    
    //     if(platform == "IOS"){                    // works on determining the platform type
    //         return new IosUIFactory();
    //     }
    //     else{
    //         return new AndroidUIFactory();
    //     }
    // }

    public UIFactory getFactory(String platform){
        return PlatformDefiner.getFactory(platform);
    }
}
