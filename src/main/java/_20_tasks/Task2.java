package _20_tasks;

import java.util.List;

/**
 * Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {


    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );

        strings.stream()
                .filter(el -> el.length() > 8)
                .distinct()
                .forEach(el -> System.out.println(el));
    }
}
