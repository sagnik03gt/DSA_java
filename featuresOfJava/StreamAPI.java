package featuresOfJava;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(1);
        nums.add(8);
        nums.add(0);

        int[] arr1 =new  int[]{1,34,56};
        int[] arr2 = new int[]{34,98,21};

        Stream.of(arr1,arr2)
                .flatMapToInt(i-> IntStream.of(i))
                .forEach(i-> System.out.println(i));

//         nums.stream()
//                 .filter(n->n%2==0)
//                 .map(n->n*2)
//                        .forEach(n-> System.out.println(n));
//        Stream<Integer> sortedStm = stm.sorted();

//        Stream<Integer> mappedStm = ;
        nums.stream().flatMap(n-> Stream.of(n*10,n*20)).forEach(n-> System.out.println(n));

//        mappedStm.forEach(n-> System.out.println(n));




    }
}
