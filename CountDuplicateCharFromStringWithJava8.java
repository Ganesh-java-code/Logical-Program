package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateCharFromStringWithJava8 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello world");

        // Concatenate all strings into one
        String concatenatedString = String.join("", strings);

        // Count the occurrence of each character
        Map<Character, Long> charCountMap = concatenatedString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the character counts
        charCountMap.forEach((character, count) -> System.out.println(character + ": " + count));
    }
}
