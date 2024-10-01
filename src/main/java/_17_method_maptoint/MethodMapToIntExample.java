package _17_method_maptoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodMapToIntExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 17);
        Student st2 = new Student("Elena", 18);
        Student st3 = new Student("Michael", 19);
        Student st4 = new Student("John", 18);
        Student st5 = new Student("Petr", 22);
        Student st6 = new Student("Jake", 23);

        List<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        List<Integer> list = students.stream()
                .mapToInt(e -> e.getAge())
                /*
                Если сейчас мы захотим наш IntStream
                Собрать в лист, то перед методом collect()
                или toList() нужно вызвать метод boxed().
                Этот метод int переведет в Integer
                 */
                .boxed()
                .toList();

        System.out.println(list);
        System.out.println();

        int[] arr = students.stream()
                .mapToInt(e -> e.getAge())
                /*
                Но в обчный массив собрать можно
                и без boxed()
                 */
                .toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        /*
        У IntStream имеются методы для работы с числами.
         */
        int sum = students.stream().mapToInt(e -> e.getAge()).sum();
        System.out.println(sum);
        System.out.println();

        double avg = students.stream().mapToInt(e -> e.getAge()).average().getAsDouble();//возвращает OptionalDouble
        System.out.println(avg);
        System.out.println();

        int min = students.stream().mapToInt(e -> e.getAge()).min().getAsInt();//Возвращает OptionalInt
        System.out.println(min);
        System.out.println();

        int max = students.stream().mapToInt(e -> e.getAge()).max().getAsInt();
        System.out.println(max);
        System.out.println();
    }
}
