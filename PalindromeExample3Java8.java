package in.ganesh.test;

import java.util.*;
import java.util.stream.IntStream;

// class must be final
public class PalindromeExample3Java8 {
    public static void main(String[] args) {
        String name = "madam";
        if(isPalindrom(name)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome..");
        }
    }

    private static boolean isPalindrom(String name) {
        return IntStream.range(0,name.length()/2)
                .allMatch(i->name.charAt(i)==name.charAt(name.length()-i-1));
    }
}