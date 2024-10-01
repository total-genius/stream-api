package _14_methods_min_and_max;



import java.util.ArrayList;
import java.util.List;

public class MethodsMinMaxExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2, 6.5);
        Student st2 = new Student("Elena", 1, 4.3);
        Student st3 = new Student("Michael", 3, 5.3);
        Student st4 = new Student("John", 4, 8.5);

        List<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        Student student1 = students.stream()
                .min((e1, e2) -> e1.getCourse() - e2.getCourse())
                .get();

        System.out.println(student1);
        System.out.println();
        Student student2 = students.stream()
                .max((e1, e2) -> e1.getCourse() - e2.getCourse())
                .get();
        System.out.println(student2);

    }
}
