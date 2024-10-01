package _3_method_forEach;

import java.util.Arrays;

public class ForEachMethodExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(array)
                .forEach(e -> System.out.print(e * 10 + " "));
    }
}
