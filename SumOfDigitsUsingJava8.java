package in.ganesh.test;

import java.util.stream.Stream;

public class SumOfDigitsUsingJava8 {
    public static void main(String[] args) {
        int number = 1234;
        Integer sum = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
