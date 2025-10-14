public class StudentSort implements Comparable<StudentSort>{
    public int age;
    public String name;
    public double psp;

    public StudentSort(int age,String name,double psp){
        this.age=age;
        this.name=name;
        this.psp=psp;
    }
    
    @Override
    public int compareTo(StudentSort s){
        return this.age-s.age;
    }
}