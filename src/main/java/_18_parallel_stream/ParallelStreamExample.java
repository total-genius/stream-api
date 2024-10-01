package _18_parallel_stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(2.25);
        list.add(32.3);
        list.add(14.10);
        list.add(5.34);
        list.add(60.0);
        list.add(17.9);
        list.add(0.25);
        /*
        Имеется 2 способа создания параллельного стрима:
        1) list.parallelStream()
        2) Stream<T> s = Stream.of(...);
           s.parallel()
         */
        double sum = list.parallelStream()
                .reduce((acc, e) -> acc + e).get();
        System.out.println(sum);

    }
}
