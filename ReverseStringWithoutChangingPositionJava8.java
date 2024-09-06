package in.ganesh.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringWithoutChangingPositionJava8 {
    public static void main(String[] args) {
       String name = "Java Programming";
        String collect = Arrays.stream(name.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
