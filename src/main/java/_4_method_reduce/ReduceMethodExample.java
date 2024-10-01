package _4_method_reduce;

import java.util.ArrayList;
import java.util.List;

public class ReduceMethodExample {
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

        //Рассмотрим 2 варианта метода reduce()

        /*
        Вариант-1

        accumulator - то, что что-то накапливает.
        Ему сразу присваивается первое значение потока.

        element - элемент потока. Начинает со второго элемента потока.

        мы перемножаем значение из аккумулятора и из элемента. Результат
        присвоится перменной accumulator, а переменная element получит
        следующее значение из потока.

        Когда обработаем последний элемент в потоке, reduce() закончит совю работу
        и результат будет собран в переменной accumulator.

        reduce() возвращает Optional
         */
        int result = list.stream()
                .reduce((accumulator, element) -> accumulator * element)
                .get();
        System.out.println(result);


        /*
        Вариант-2
        1, которая стоит перед перменными accumulator & element -
        это первичное значение, которое будет присваиваться
        переменной accumulator.

        Здесь уже Optional не возвращается, потому что первоначальное
        значение есть.
         */
        int result2 = list.stream()
                .reduce(1, (accumulator, element) -> accumulator + element);
        System.out.println(result2);

    }
}
