package intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

//        public static void main(String[] args) {Intermediate operations are convert one stream to another stream
//        they are lazy in nature means they will not run until terminal operation invoked.


        List<String> str = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Ganesh");

//        1) filter

        List<String> name = str.stream().filter(x -> x.startsWith("G")).collect(Collectors.toList());

        System.out.println(name);


//        2) map

        str.stream().map(String::toLowerCase).forEach(System.out::println);


//        3) sorted

        str.stream().sorted().forEach(System.out::println);

        str.stream().sorted(((o1, o2) -> o1.length() - o2.length())).forEach(System.out::println);
        str.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


//        4) distinct


        str.stream().map((x) -> x.startsWith("G")).distinct().forEach(System.out::println); // Ghanshyam

//        5) count

        str.stream().limit(2).forEach(System.out::println); // "Ram", "Shyam"
//
//
//        6) skip
        str.stream().skip(2).limit(2).forEach(System.out::println); // Ghanshyam, Ganesh



    }
}
