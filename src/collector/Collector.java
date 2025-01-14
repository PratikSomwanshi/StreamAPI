package collector;

public class Collector {

    List<Integer> integer = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    List<Integer> integerList = integer.stream().collect(Collectors.toList());

    Set<Integer> integerSet = integer.stream().collect(Collectors.toSet());

    ArrayList<Integer> collect = integer.stream().collect(Collectors.toCollection(ArrayList::new));

    IntSummaryStatistics collect1 = integer.stream().collect(Collectors.summarizingInt(Integer::intValue));

    Double collect2 = integer.stream().collect(Collectors.averagingInt(Integer::intValue));

    Long collect3 = integer.stream().collect(Collectors.counting());


//        System.out.println(collect3);


    List<String> words = Arrays.asList("hello","world","stream", "java");

//        Map<Integer, List<String>> collect4 = words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(String::length));


//        Map<Integer, String> collect4 = words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(String::length, Collectors.joining("/ ")));

    TreeMap<Integer, String> collect4 = words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(String::length,
            TreeMap::new, Collectors.joining(",")));

        System.out.println(collect4);

    //        2) Partitioning

//    do dunia banata hai jaise ki jo string 5 se badi hai vo true mai aur baki false mai

    Map<Boolean, List<String>> collect = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
//        System.out.println(collect);


//        3) mapping

    List<String> collect1 = words.stream().collect(Collectors.mapping(String::toLowerCase, Collectors.toList()));
        System.out.println(collect1);

}
