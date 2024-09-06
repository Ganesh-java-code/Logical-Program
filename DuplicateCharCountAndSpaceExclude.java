package in.ganesh.test;
//1. list partition..[done..]
//2. balanced bracket..[done..]
//3. duplicate character/number count from list..[?]
//4. Singleton design pattern.[eager,lazy,syncronization,double lock check]..
//5. factory design pattern[ Eg - Notification(I) ]
//6. Prime Number using java 8 and without java 8
//7. fibonacci series using java 8 and without java 8
//8. Object array flattening..
//9. segregate zero and one from array..
//10. odd number using java 8
//11. Reverse number using stack[eg - 1234 => 4321]
//12. Factorial number.
//13. Armstrong number
//14. Immutable class.


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharCountAndSpaceExclude {
    public static void main(String[] args) {
        String input = "hello world ";

        // Count the occurrence of each character
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ') // Exclude spaces
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Filter characters that appear more than once and form the output string
        String output = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry->entry.getKey()+": "+entry.getValue())
                .collect(Collectors.joining(", "));

        System.out.println("Output: " + output);
    }
}