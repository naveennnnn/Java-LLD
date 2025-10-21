import java.util.ArrayList;
import java.util.List;

public class Animals extends SuperAnimal{
    public void doSomething(ArrayList<Animals> animalList){
        // what if ArrayList<Cats>- not yet created ,but if it sent here then , it will throw an error.
        for(int i = 0;i<2;i++){
            animalList.add(new Dogs());
        } // Just to tell that something might go wrong
    }

    public void doSomethingChild(List<? extends Animals> animalList){
        /* this function will accept Animals and anything that extends Animals
            ex: List<Animals>, List<Dogs> ,List<Cats> etc.
        */
    }
    
    public void doSomethingParent(List<? super Animals> animalList){
        
    }
}
