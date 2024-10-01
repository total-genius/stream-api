package _12_method_collect_grouping_and_partitioning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodCollectExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Elena", 1);
        Student st3 = new Student("Mike", 2);
        Student st4 = new Student("Maria", 2);
        Student st5 = new Student("John", 3);
        Student st6 = new Student("Jane", 3);
        Student st7 = new Student("Jack", 4);
        Student st8 = new Student("Jill", 4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);

        /*
        Сгруппируем студентов по курсу,
        для каждого курса отдельный лист студентов.

        В нижеописанном примере, на выходе мы получим
        мапу, где ключ будет номер курса, а значение
        лист студентов
         */
        Map<Integer, List<Student>> map = students.stream()
                .map(e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                //группируем студентов по курсу. На выходе получим Map<Integer,List<Student>>
                .collect(Collectors.groupingBy(e -> e.getCourse()));
        System.out.println(map);

        /*
        Теперь разделим студентов на две группы
         */
        Map<Boolean, List<Student>> map2 = students.stream()
                /*
                Разделяем студентов на две группы. Получим мапу из
                2 элементов. Ключи будут true и false
                 */
                .collect(Collectors.partitioningBy(e -> e.getCourse() > 2));
        System.out.println();
        System.out.println(map2);

    }
}
