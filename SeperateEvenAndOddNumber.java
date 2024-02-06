package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateEvenAndOddNumber {
    public static void main(String[] args) {
         /* List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       // without java 8
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ( i%2==0 ) {
                even.add(i);
            }else {
                odd.add(i);
            }
    }
        System.out.println(even);
        System.out.println(odd);*/

        // with java 8
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i -> i % 2 != 0));
        System.out.println(collect);

    }
}
