package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        List<String> list = Arrays.asList(str1, str2);
        String s1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String s2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if ( s1.equals(s2) ){
            System.out.println("two strings characters are same...");
        }else{
            System.out.println("two strings characters are not same..");
        }

    }
}
