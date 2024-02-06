package in.ganesh.test;

import java.util.Arrays;
import java.util.List;

public class SecondSmallestAndsecondLargest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 9, 2, - 11, 4, 0, 5);
        Integer secondSmallest = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println(secondSmallest);//0

        List<Integer> list1 = Arrays.asList(3, 1, 9, 2, - 11, 4, 0, 5);
        Integer secondLargest = list1.stream().sorted((s1, s2) -> - s1.compareTo(s2)).distinct().skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);//5

    }
}
