package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharFromListOfStringUsingJava8 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaryanna");
        String s = list.toString();
        Stream<Character> characterStream = s.chars().mapToObj(c -> (char) c);
        List<Map.Entry<Object, Long>> entries = Arrays.stream(characterStream.toArray()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1).toList();
        entries.forEach(System.out::println);

    }
}
