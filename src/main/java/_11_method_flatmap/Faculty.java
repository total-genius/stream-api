package _11_method_flatmap;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        students = new ArrayList<Student>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
