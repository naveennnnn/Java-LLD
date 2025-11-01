package Builder;

public class Client {
    public static void main(String[] args) {
        // StudentHelper sHelper = StudentHelper.getBuilder();
        // sHelper.setName("Naveen");
        // sHelper.setAge("24");
        // sHelper.setGrade("A");
        // sHelper.setPsp(98.7);
        // Student s = new Student(sHelper);

        // Student s = StudentHelper.getBuilder()
        //                 .setName("Naveen")
        //                 .setAge("24")
        //                 .setGrade("A")
        //                 .setPsp(98.7)
        //                 .build();
        // System.out.println("Name: "+s.getName());

        // Student normalStudent = new Student();  this is possible since the constructor is public

        Student s = Student.getBuilder()
                        .setName("Naveen")
                        .setAge("24")
                        .setGrade("A")
                        .setPsp(98.7)
                        .build();
        System.out.println("Name: "+s.getName());
        
    }
}
