import java.util.Comparator;
public class StudentsNameSorter implements Comparator<StudentSort>{
    @Override
    public int compare(StudentSort s1, StudentSort s2){
        return s1.name.compareTo(s2.name);
    }
}
