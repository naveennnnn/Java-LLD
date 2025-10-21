import java.util.ArrayList;
import java.util.List;

public class GenericClient {
    public static void main(String[] args) {

        // Example 1
        Pair <Integer,String>p = new Pair<>();
        p.setFirst(10);
        p.setSecond("asdasd");
        System.out.println(p.getFirst()+"  "+p.getSecond());

        // Example 2
        Pair<Integer,Integer> point = new Pair<Integer,Integer>();
        point.setFirst(20);
        point.setSecond(30);
        System.out.println(point.getFirst()+"  "+point.getSecond() +" "+point.getCount()); 

        // Example 3
        // SingleDataTypePair<Integer,Integer> point1 = new SingleDataTypePair<>(); // Not allowed
        SingleDataTypePair<Integer> point1 = new SingleDataTypePair<>();

        // Example 4
        GenericWithClass<Student> Genobj = new GenericWithClass<>();
        Genobj.setFirst(new Student());
        Genobj.getFirst().name = "Naveen";
        Genobj.getFirst().rollNo = 20;
        Genobj.getFirst().std = "12th";
        System.out.println(Genobj.getFirst().name+" "+Genobj.getFirst().std+" "+Genobj.getFirst().rollNo);


        int a = 1000;
        // Example 5
        Pair<Double,Double> Pair = new Pair<>();
        Pair.something("Naveen",40);
        Pair.something(a,"ABCD");
        Pair.something(10.20,20);


        //Inheritance in Generic
        Animals ani = new Animals();
        Animals dog1 = new Dogs();
        Dogs dog2 = new Dogs();
        ArrayList<Animals> animalList = new ArrayList<>();
        ArrayList<Dogs> dogList = new ArrayList<>();
        animalList.add(ani);
        animalList.add(dog1);
        animalList.add(dog2);
        // dogList.add(dog1); // Not allowed
        dogList.add(dog2); // allowed
        ani.doSomething(animalList);
        //NOT ALLOWED The below line
        // ani.doSomething(dogList); // Dogs extend Animals but List<Dogs> doesnt extend List<Animals>.
        /*if this is allowed, then all the operations on Animals list has to be performed on 
        this list, which is not possible.
        for example, if we add a cat to the list in the Animals.doSomething, then it will throw an error.
         */ 

        //Example 6
        ani.doSomethingChild(animalList);
        ani.doSomethingChild(dogList); // this is accepted since we are using generics

        List<SuperAnimal> superAnimalList = new ArrayList<>();
        ani.doSomething(animalList);
        ani.doSomethingParent(superAnimalList);
        
    }
}
