package _2_method_filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMethodExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(15);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(12);
        list.add(13);

        List<Integer> list2 = list.stream()
                .filter(e -> e % 2 != 0)
                .toList();



        Predicate<Integer> p1 = e -> e>5;
        Predicate<Integer> p2 = e -> e <= 10;

        List<Integer> list3 = list.stream()
                .filter(p1.and(p2))
                .toList();


        System.out.println(list);
        System.out.println();
        System.out.println(list2);
        System.out.println();
        System.out.println(list3);
    }
}
