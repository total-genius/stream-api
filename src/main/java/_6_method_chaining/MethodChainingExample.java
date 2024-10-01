package _6_method_chaining;

import java.util.Arrays;

public class MethodChainingExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 4, 8, 7, 9, 10, 12, 11, 14, 13, 16, 15, 18, 17, 20, 19};
        //Пример цепочки методов в потоках
        int result = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .peek(e-> System.out.print(e+" "))
                .reduce((acc, e) -> acc + e)
                .getAsInt();

        System.out.println();
        System.out.println(result);
    }
}
