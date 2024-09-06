package in.ganesh.test;

import java.util.Arrays;
import java.util.List;

import java.util.stream.IntStream;

public class PrimeNumberUsingJava8Approach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> primeNum = list.stream().filter(PrimeNumberUsingJava8Approach::isPrime).toList();
        primeNum.forEach(System.out::println);

    }
    private static boolean isPrime(Integer num) {
        return IntStream.rangeClosed(2,num/2).noneMatch(i->num%i==0);
    }
}
