package how_to_create_stream;

import java.util.stream.IntStream;

public class Stream {

//        How to use stream
//        Source, Intermediate operation and terminal operation

//        1) using on collection

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Stream<Integer> stream = list.stream();

//        2) using Arrays as source

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        IntStream stream = Arrays.stream(arr);

        Stream<Integer> boxed = stream.boxed();

//        3) using Stream.of()

        Stream<String> strStream = Stream.of("a", "b", "c", "d", "e", "f", "g", "h");

//        4) infinite stream

        Stream<Double> randomInfiniteStream = Stream.generate(Math::random);

        Stream<Integer> iterate = Stream.iterate(0, i -> i + 1);
//        Above iterate accepts seed as 0 means starting point and UnaryOperator is a function which have  same data type for input  and return


//        NOTE:
//        for string also you can create stream that is


                String name = "rohan";
                IntStream chars = name.chars();








}

