package in.ganesh.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4,5,6,7,8,9);
        int n = 3;
        List<List<Integer>> num = partitionListNum(list, n);
        num.forEach(System.out::println);

    }

    private static List<List<Integer>> partitionListNum(List<Integer> list, int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i =0; i<list.size();i=i+n){
            int end = Math.min(i + n, list.size());
            result.add(new ArrayList<>(list.subList(i,end)));
        }
        return result;

    }

}
