package _8_method_distinct;

import java.util.Arrays;

public class DistinctMethodExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 6, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = Arrays.stream(arr)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
    }
}
