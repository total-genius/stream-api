package _10_method_peek;

import java.util.ArrayList;
import java.util.List;

public class MethodPeekExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(8);

        long result = list.stream()
                .peek(e-> System.out.print(e+" "))
                .distinct()
                .count();
    }
}
