package in.ganesh.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class removeDuplicateNumberFrmArr {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,1,4,5,2,1,3,2,4,1,2};
        IntStream distinct = Arrays.stream(arr).distinct();
        distinct.forEach(System.out::println);

    }
}
