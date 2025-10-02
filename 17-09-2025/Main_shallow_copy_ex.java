// Shallow copy, Deep copy example
import java.util.*;
public class Main_shallow_copy_ex {
    public static void main(String[] args) {
        ArrayList<Integer> new_l = new ArrayList<>();
        new_l.add(1);
        new_l.add(2);
        new_l.add(3);
        Student1 s1 = new Student1(23,"Naveen",new_l);
        Student1 s2 = new Student1(s1);
        System.out.println(s1.age +" "+ s1.name);
        System.out.println(s2.age +" "+ s2.name);
        for(int i:s1.l){
            System.out.println(i);
        }
        for(int i:s2.l){
            System.out.println(i);
        }
        s2.age = 24;
        s2.name += "khan";
        s2.l.add(4);
        System.out.println(s1.age +" "+ s1.name);
        System.out.println(s2.age +" "+ s2.name);
        for(int i:s1.l){
            System.out.println(i);
        }
        for(int i:s2.l){
            System.out.println(i);
        }

        Instructor i1 = new Instructor("Naveen",23);
        // i1.id = 101; // Not allowed because id is private in parent class
    }
}
