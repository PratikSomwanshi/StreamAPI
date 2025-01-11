package terminal_operations;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperations {
    //        Terminal Operations

    List<String> str = Arrays.asList(
            "Shyam", "Ghanshyam", "Ganesh", "Shyam"
    );

//        1) collect

        List<String> stringList = str.stream().collect(Collectors.toList());
        Set<String> stringSet = str.stream().collect(Collectors.toSet());
        List<String> stringSet = str.stream().toList();

//        2) foreach

                str.stream().forEach(System.out::println);

//     3) reduce

        Optional<String> reduce = str.stream().reduce((x, y) -> x);

//        4) count

    long count = str.stream().limit(2).count(); // 2

//        below are short circuit method means if they fornd result it will terminate automatically

//        5) anyMath, allMatch, noneMatch

        boolean shyam = str.stream().anyMatch(s -> s.equals("Shyam")); // true

        str.stream().allMatch(s -> s.equals("Shyam")); // false

        str.stream().noneMatch(s -> s.equals("Ghanshyam")); // false

//        6) findFirst, findAny

    Optional<String> first = str.stream().findFirst();

    Optional<String> any = str.stream().findAny(); // thi will find any element from the list

//    7) toArray()

        Object[] arr = Stream.of(1,2,3,4,5,6).toArray();

//    8) min/max

    Optional<Integer> max = Stream.of(1,2,3,4).max(Comparator.naturalOrder());
    Optional<Integer> min = Stream.of(1,2,3,4).min(Comparator.naturalOrder());

//    9) flatMap

    List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));


    List<Integer> list = lists.stream().flatMap(Collection::stream).toList();

    System.out.println(list); // [1,2,3,4,5,6,7,8,9]



}
