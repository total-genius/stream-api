package _11_method_flatmap;

import java.util.ArrayList;
import java.util.List;

public class MethodFlatMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 2);
        Student st3 = new Student("Michael", 3);
        Student st4 = new Student("David", 4);
        Student st5 = new Student("John", 1);
        Student st6 = new Student("Elena", 2);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");

        f1.addStudent(st1);
        f1.addStudent(st2);
        f1.addStudent(st3);

        f2.addStudent(st4);
        f2.addStudent(st5);
        f2.addStudent(st6);

        List<Faculty> faculties = new ArrayList<Faculty>();
        faculties.add(f1);
        faculties.add(f2);

        //Получим всех студентов из всех факультетов
        faculties.stream()
                .flatMap(f -> f.getStudents().stream())
                .forEach(s -> System.out.println(s));
    }
}
