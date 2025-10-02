import java.util.*;
import java.util.ArrayList;
public class Student1 {
    int age;
    String name;
    ArrayList<Integer> l;
    public Student1(int age,String name,ArrayList<Integer> li){
        this.age = age;
        this.name = name;
        l = li;
    }
    public Student1(Student1 s1){
        this.age = s1.age;
        this.name = s1.name;
        this.l = s1.l;
    }
}
