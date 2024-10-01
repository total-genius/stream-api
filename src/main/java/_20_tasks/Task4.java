package _20_tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список целых чисел, вывести строку,
 * представляющую собой конкатенацию
 * строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 4, 2, 1);
        String collect = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("", "", ""));
        System.out.println(collect);

//        String result = integers.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(",", "Prefix: ", " end"));
//        System.out.println(result);
    }
}
