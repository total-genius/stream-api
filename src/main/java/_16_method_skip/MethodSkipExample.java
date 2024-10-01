package _16_method_skip;

import java.util.ArrayList;
import java.util.List;

public class MethodSkipExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        list.stream()
                .filter(i -> i % 2 != 0)
                .skip(5)
                .forEach(System.out::println);
    }
}
