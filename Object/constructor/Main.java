public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Gagamboy", 15, 1.5);
        Student student2 = new Student("Michelle", 18, 1.00);

        System.out.println(student1.name);
        student1.study();
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();
        System.out.println(student2.name);
        student2.study();
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);



    }
}
