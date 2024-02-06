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
        //14. Immutable class
        //15. Singleton Design pattern.
        //16. Factory Design Pattern.
        //17. Immutable class contains mutable object how to handle this situation[program]
        //18. Palindrome number/string
        //19. Strong number
        //20. Duplicate character occurrence with java 8 and without java 8
        //21. Reverse String  [  output - avaJ gnimmargorP  ],  [  output  -  gnimmargorP avaJ  ]
        //22. Binary Search java Program..
        //23. Linear Search java Program..
        //24.  Square Number and sum using java 8.
        //25. Sum of each digit java 8 program.
        //26. MergeTwoSortedLinkedList Data Structure. *****IMP
        //27. Insertion Sort program.
        //28. Selection sort program.
        //29. Remove Duplicate Element From Array Using HashMap
        //30. remove Duplicate Number From Array..
        //31. Concurrent Collection[concurrentMap,ConcurrentHashMap]
        //. Read input Using Buffered Reader Class

        List<String> list = List.of("india is my country....");
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