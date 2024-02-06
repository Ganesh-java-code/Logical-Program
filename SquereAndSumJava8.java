package in.ganesh.test;

import java.util.Arrays;
import java.util.List;

public class SquereAndSumJava8{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().map(i -> i * i).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
