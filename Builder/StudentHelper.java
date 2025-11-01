// package Builder;

// public class StudentHelper {
//     private String name;
//     private String age;
//     private String grade;
//     private double psp;

//     private StudentHelper(){}

//     public String getName() {
//         return name;
//     }
//     public StudentHelper setName(String name) {
//         this.name = name;
//         return this;
//     }
//     public String getAge() {
//         return age;
//     }
//     public StudentHelper setAge(String age) {
//         this.age = age;
//         return this;
//     }
//     public String getGrade() {
//         return grade;
//     }
//     public StudentHelper setGrade(String grade) {
//         this.grade = grade;
//         return this;
//     }
//     public double getPsp() {
//         return psp;
//     }
//     public StudentHelper setPsp(long psp) {
//         this.psp = psp;
//         return this;
//     }

//     public static StudentHelper getBuilder(){
//         return new StudentHelper();
//     }

//     public Student build(){
//         return new Student(this);
//     }
// }
