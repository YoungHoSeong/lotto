import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lotto {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 45).mapToObj(x -> x).collect(Collectors.toList());


        for (int i = 0; i < 5; i++) {
            Collections.shuffle(collect);

            List<Integer> integers = collect.subList(0, 6);
            Collections.sort(integers);

            System.out.println("LOTTO NUMBER = " + integers.toString());
        }
    }
}
