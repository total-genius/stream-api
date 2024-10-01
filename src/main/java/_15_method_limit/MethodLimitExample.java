package _15_method_limit;

import java.util.ArrayList;
import java.util.List;

public class MethodLimitExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
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

        list.stream()
                .filter(e -> e % 2 != 0)
                .limit(3)
                .forEach(System.out::println);
    }
}
