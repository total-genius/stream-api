package _9_method_count;

import java.util.ArrayList;
import java.util.List;

public class MethodCountExample {
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

        long count = list.stream().count();
        System.out.println(count);
    }
}
