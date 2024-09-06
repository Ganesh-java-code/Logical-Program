package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String s1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String s2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if ( s1.equals(s2) ){
            System.out.println("two strings characters are same...");
        }else{
            System.out.println("two strings characters are not same..");
        }

    }
}

//public class Test7 {
//    public static void main(String[] args) {
//        String s1 = "listen";
//        String s2 = "silent";
//
//        boolean isAnagram = areAnagram(s1,s2);
//        if ( isAnagram ){
//            System.out.println("Anagram ..");
//        }else {
//            System.out.println("not Anagram..");
//        }
//
//    }
//
//    private static boolean areAnagram(String s1, String s2) {
//        s1=s1.replaceAll("\\s","").toLowerCase();
//        s2 = s2.replaceAll("\\s", "").toLowerCase();
//
//        // two string length are not same then below condition
//        if ( s1.length()!=s2.length() ){
//            return false;
//        }
//
//        char[] s1CharArray = s1.toCharArray();
//        char[] s2CharArray = s2.toCharArray();
//
//        Arrays.sort(s1CharArray);
//        Arrays.sort(s2CharArray);
//
//        return Arrays.equals(s1CharArray,s2CharArray);
//    }
//}
