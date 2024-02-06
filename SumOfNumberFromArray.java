package in.ganesh.test;

import java.util.Arrays;
import java.util.List;

public class SumOfNumberFromArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

//        int num = 1234;
//        int sum = String.valueOf(num)
//                .chars()
//                .map(Character::getNumericValue)
//                .sum();
//        System.out.println(sum);

    }
}
