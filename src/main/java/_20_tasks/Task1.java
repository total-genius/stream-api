package _20_tasks;


import java.util.List;

/***
 * Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 20, 10);
        integers.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> 5 == 0)
                .mapToInt(Integer::intValue)
                .average().ifPresent(System.out::println);
    }
}
