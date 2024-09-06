package in.ganesh.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //1. Partition list of integers [1,2,3,4,5,6,7,8,9]  => [1,2,3][4,5,6][7,8,9] => n=3
        //2. Balanced bracket
        //3. Duplicate character/number count from list
        //4. singleton class design pattern
        //5. factory design pattern
        //6. prime number
        //7. fibonacci series
        //8. Object Array Flattening.
        //9.  Segregate Array number zero and one
        //10. Odd number using java 8
        //11. Reverse Number using stack
        //12. Factorial Number
        //13. Armstrong Number.
        //14. Immutable class example - 1,example - 2,example - 3
        //15. Immutable class contains mutable object how to handle this situation[program]
        //16. Palindrome number/string
        //17. Strong number
        //18. Duplicate character occurrence with java 8 and without java 8
        //19. Reverse String  [  output - avaJ gnimmargorP  ],  [  output  -  gnimmargorP avaJ  ]
        //20. Binary Search java Program..
        //21. Linear Search java Program..
        //22.  Square Number and sum using java 8.
        //23. Sum of each digit java 8 program.
        //24. MergeTwoSortedLinkedList Data Structure. *****IMP
        //25. Insertion Sort program.
        //26. Selection sort program.
        //27. Remove Duplicate Element From Array Using HashMap
        //28. remove Duplicate Number From Array..
        //29. Concurrent Collection[concurrentMap,ConcurrentHashMap]
        //30. input : java and ouput : avaj
        //31. third highest salary.
        //32. department wise highest salary and multiple filters.
        //33. Anagram[two string char must be same].
        //34. FirstNonRepeatedChar [input = "abbccddatppqrsqrs" output="t"]
        //35. Swipe two variable without using third varjable
        //36. diamond/other star pattern program.
        //37. Difference Between Two Number from array java program
        //38. Seprate String KeyWithValue Using Regular Expression
        //39. Java Program for character input = a,b,c,d,e,f       output = f
        //40. find pairs of numbers which sum is 10
        //41. Java Program To Reverse And Add A Number Until You Get A Palindrome [not implemented...]
        //42.  Find missing number in an array.
        //43. Write a Java program to find number of characters, number of words and number of lines in a text file?
        //44. How do you convert HashMap to ArrayList in Java?
        //45. All permutations of a string.
        //46. Write a Java program to print Floyd’s Triangle?
        //47.  Finding The First Repeated And Non-Repeated Character In A String.
        //48. Spiral Matrix Program.
        //49. String to Integer and Integer to String Conversion program.
        //50. How to find type, total space, free space and usable space of all drives in Java?
        //51. Harshad Number (Niven Number) Program
        //52. Disarium Number Program In Java.
        //53. Bubble Sort Algorithm In Java
        //54. Odd and even numbers by two threads in Java
        //55. Java program to print common characters between two strings in alphabetical order.
        //56. java program to display unique char from string.
        //57.
        //58.
        //59.
        //60.

        //. Read input Using Buffered Reader Class

      //  List<String> list = List.of("india is my country....");
//        String s = list.toString();
//
//        Stream<Character> characterStream = s.chars().mapToObj(c -> (char) c);
//        List<Map.Entry<Object, Long>> collect = Arrays.stream(characterStream.toArray()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1).collect(Collectors.toList());
//
//        collect.forEach(System.out::println);

//        String s ="india is my country...";
//        Stream<Character> characterStream = s.chars().mapToObj(c -> (char) c);
//        List<Map.Entry<Object, Long>> entries = Arrays.stream(characterStream.toArray()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1).toList();
//        entries.forEach(System.out::println);

//        Set<Integer> set = new HashSet<>(list);
//        for (Integer i : set){
//            int frequency = Collections.frequency(list, i);
//            System.out.println(i+" "+frequency);
//        }

//        String str = "Monopoly";
//        AtomicReference<CharSequence> s1= new AtomicReference<>(str);
//         Pattern.compile(".").matcher(s1.get()).results().map(m -> m.group().toLowerCase()).collect(Collectors.groupingBy(s -> s, () -> new LinkedHashMap<String, Long>(), Collectors.counting())).forEach((k, v) -> System.out.println(k + " = " + v + " times"));

    }
}