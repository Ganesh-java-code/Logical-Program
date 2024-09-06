package in.ganesh.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordWithSortOfFirstCharOfEachWord {

    public static void main(String[] args) {
        // Input string
        String input = "Hello my name is Ganesh Patil";

        // Get the sorted string
        String result = sortWordsByFirstCharacter(input);

        // Print the result
        System.out.println(result);

//        String word = "Hello";
//        String firstChar = word.substring(0, 1);
//        System.out.println("testing :: "+firstChar);  // Output: H
    }

    private static String sortWordsByFirstCharacter(String input) {
        // Split the input string into words
        List<String> words = Arrays.asList(input.split(" "));

        // Sort the list of words based on the first character of each word, ignoring case
        List<String> sortedWords = words.stream()
                .peek(System.out :: println)
                .sorted(Comparator.comparing(word -> word.substring(0, 1).toLowerCase()))
                .collect(Collectors.toList());

        Collections.reverse(sortedWords);

        // Join the sorted words into a single string separated by spaces
        String join = String.join(" ", sortedWords);

        System.out.println(join);

        return join;
    }
}
