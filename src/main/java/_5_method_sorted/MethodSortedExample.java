package _5_method_sorted;

import java.util.Arrays;

public class MethodSortedExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 9, 11, 12, 7, 8, 4, 5, 10};
        int[] arr2 = Arrays.stream(arr)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
