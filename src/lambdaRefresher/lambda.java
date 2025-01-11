package lambdaRefresher;

import java.util.function.*;

public class lambda {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(5)); // false

        Function<Integer, Integer> function = x -> x * 2;
        System.out.println(function.apply(10)); // 20

        Consumer<Integer> consumer = (x) -> System.out.println(x);
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(10); // no output

        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get()); // 10

        BiPredicate<Integer, Integer> isEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isEven.test(1, 2)); // false

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x: " + x + ", y: " + y);
        biConsumer.accept(1, 2); // x: 1, y: 2

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println(sum.apply(1, 2));// 3


        Function<Integer, Integer> function = (x) -> x * 2;
        UnaryOperator<Integer> unaryOperator = x -> x * 2;   // works same as function but we dont have to write two time data type if the data types are same
        System.out.println(unaryOperator.apply(10));


        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        BinaryOperator<Integer> sum = Integer::sum;  // works same as BiFunction but we don't have to write three time data type if the data types are same
        System.out.println(sum.apply(2, 3));
    }
}
