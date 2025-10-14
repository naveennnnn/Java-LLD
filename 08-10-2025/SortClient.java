import java.util.*;
public class SortClient {
    public static void main(String[] args) {
        List<StudentSort> students = new ArrayList<StudentSort>();
        StudentSort s1 = new StudentSort(23,"Naveen",95.78);
        StudentSort s2 = new StudentSort(21,"Praveen",99.78);
        StudentSort s3 = new StudentSort(40,"Yash",98.78);
        StudentSort s4 = new StudentSort(20,"Greak",90.78);
        StudentSort s5 = new StudentSort(24,"you",100);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Collections.sort(students);
        for(StudentSort i:students){
            System.out.println("age: "+ i.age +" name: "+i.name+" psp: "+i.psp);
        }

        Collections.sort(students,new StudentsNameSorter());
        for(StudentSort i:students){
            System.out.println("age: "+ i.age +" name: "+i.name+" psp: "+i.psp);
        }
    }
    
}
