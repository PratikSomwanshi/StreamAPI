package parallel_stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    long before = System.currentTimeMillis();

    List<Integer> array = Stream.iterate(
            0 ,
            Main::factorial
    ).limit(20000).toList();

    long after = System.currentTimeMillis();

        System.out.println("time sequential "+(after - before)); // 150ms


    before = System.currentTimeMillis();

    List<Integer> arr = Stream.iterate(
            0 ,
            x -> x + 1
    ).limit(20000).toList();

    arr.parallelStream().map(Main::factorial).count();


     after = System.currentTimeMillis();

        System.out.println("time parallel"+(after - before)); // 15ms




public static int  factorial(int x){
    long result = 1;
    for(int i = 2; i <= x; i++){
        result *= i;
    }

    return (int) result;
}


}
