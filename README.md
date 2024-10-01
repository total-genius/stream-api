# Stream API

**Stream - поток**. Последовательность элементов, которая поддерживает последовательные и параллельные операции на ними.

### Как создать поток
1. **Из коллекции:** 
```java
    List<Integer> list = new ArrayList<>();
    list.stream();
```

2. **С помощью класса Stream:**
```java
Stream<String> stream = Stream.of("A","B","C");
```

### Методы:
***методы стримов не меняют коллекцию, для которой они вызваны.***

**method chaining** - цепочка методов в потоках. Последовательность
методов, которая срабатывает друг за другом и поочередно
производят какие-либо операции над элементами потока.

Пример - [MethodChainingExample](src/main/java/_6_method_chaining/MethodChainingExample.java)

Есть **промежуточные методы и терминальные**. Промежуточных методов
в цепочке потоков может быть большое количество,
но термильный метод должен быть один и быть последним методом
в цепочке методов стрима.


Промежуточные методы также называют **lazy methods**. Они обрабатывают элементы потока
и возвращают поток (Stream) обработанных элементов, который подойдет дальше по следующим
промежуточным методам.**!!!Промежуточные методы не будут выполнятся пока не будет вызван термильный метод.**

Терминальный метод уже не возвращает поток. Он либо возвращает какой-то результат или не возвращает
ничего. Терминальный метод завершает работу потока. Термильные методы называют **eager methods**.

**Пример промежуточных методов**:
1. `map(Function<? super T, ? extends R> mapper)`. Пример - [MethodMapStreamExample](src/main/java/_1_method_map/MethodMapStreamExample.java)
2. `filter(Predicate<? super T> predicate)`. Пример - [FilterMethodExample](src/main/java/_2_method_filter/FilterMethodExample.java)
3. `flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)`. Пример - [MethodFlatMapExample](src/main/java/_11_method_flatmap/MethodFlatMapExample.java)
4. `sorted()` и `sorted(Comparator<? super T> comparator)` - при соритровке объектов наших классов нужно передать в 
парметры методы `Comparator` или реализовать `Comparable`. Пример - [MethodSortedExample](src/main/java/_5_method_sorted/MethodSortedExample.java)
5. `distinct()` - не принимает параметров (использует equals() для определения уникальности). Пример - [DistinctMethodExample](src/main/java/_8_method_distinct/DistinctMethodExample.java)
6. `peek(Consumer<? super T> action)`. Пример - [MethodPeekExample](src/main/java/_10_method_peek/MethodPeekExample.java)
7. `limit(long maxSize)`. Пример - [MethodLimitExample](src/main/java/_15_method_limit/MethodLimitExample.java)
8. `skip(long n)`. Пример - [MethodSkipExample](src/main/java/_16_method_skip/MethodSkipExample.java)
9. `mapToInt(ToIntFunction<? super T> mapper)`. Пример - [MethodMapToIntExample](src/main/java/_17_method_maptoint/MethodMapToIntExample.java)

**Пример терминальных методов:**
1. `reduce()`. Пример - [ReduceMethodExample](src/main/java/_4_method_reduce/ReduceMethodExample.java)
   - `Optional<T> reduce(BinaryOperator<T> accumulator)`
   - `T reduce(T identity, BinaryOperator<T> accumulator)`
   - `<U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)`
2. `count()`. Пример - [MethodCountExample](src/main/java/_9_method_count/MethodCountExample.java)
3. `forEach(Consumer<? super T> action)`. Пример - [ForEachMethodExample](src/main/java/_3_method_forEach/ForEachMethodExample.java)
4. `collect()`
   - `groupingBy(Function<? super T, ? extends K> classifier)`
   - `partitioningBy(Predicate<? super T> predicate)`
   - Пример - [MethodCollectExample](src/main/java/_12_method_collect_grouping_and_partitioning/MethodCollectExample.java)
5. `findFirst()`. Пример - [MethodFindFirstExample](src/main/java/_13_method_findfirst/MethodFindFirstExample.java)
6. `min(Comparator<? super T> comparator)` и `max(Comparator<? super T> comparator)`. Пример - [MethodsMinMaxExample](src/main/java/_14_methods_min_and_max/MethodsMinMaxExample.java)

**Особые случаи**
1. `concat(Stream<? extends T> a, Stream<? extends T> b)` - Это статический метод класса Stream, который объединяет 
два потока в один. Не является ни промежуточным, ни терминальным методом. Пример - [ConcatMethodExample](src/main/java/_7_method_concat/ConcatMethodExample.java)


#### Parallel Stream
**Parallel Stream** - параллельные потоки. По умолчанию мы используем последовательные потоки.
Параллельные потоки дают возможность испльзовать несколько ядер процессора для
выполнения каких-либо операций с потоком.

Пример - [ParallelStreamExample](src/main/java/_18_parallel_stream/ParallelStreamExample.java)

Использование параллельных стримов подходит тогда, когда порядок обработки
элементов не влияет на исходный результат. Также, стоит ипользовать их
когда мы работаем с очень большим количеством данных. 
