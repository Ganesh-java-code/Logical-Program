package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayIntoSingleSortedArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        IntStream intStream1 = list1.stream().mapToInt(Integer::intValue);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        IntStream intStream2 = list2.stream().mapToInt(Integer::intValue);
        int[] array = IntStream.concat(intStream1, intStream2).sorted().toArray();
        for (Integer numSort:array){
            System.out.print(numSort+" ");
        }
    }
}
