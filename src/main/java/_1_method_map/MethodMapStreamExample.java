package _1_method_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodMapStreamExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("JavaScript");
        strings.add("C#");

        System.out.println(strings);
        System.out.println();
        /*
        Получим лист, который будет содержать не стринги,
        а длину этих стрингов
         */
        List<Integer> list = strings
                //Получаем поток из коллекции
                .stream()
                //Используем операцию map()
                .map(e -> e.length())
                //Переводим поток обратно в лист. Получаем новый лист
                .toList();
        System.out.println(list);
        System.out.println();

        //На массивах тоже можно вызвать поток
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = Arrays.stream(arr)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
    }
}
