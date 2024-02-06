package in.ganesh.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharAndNumCountFrmList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3);
        String s = list.toString();
        Stream<Character> characterStream = s.chars().mapToObj(c -> (char) c);
        List<Map.Entry<Object, Long>> entries = Arrays.stream(characterStream.toArray()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1).toList();
        entries.forEach(System.out::println);

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 10, 6, 4, 7, 5, 9, 8, 10);
//        HashSet<Integer> hashSet = new HashSet<>(list);
//        for (Integer i:hashSet){
//            int frequency = Collections.frequency(list, i);
//            System.out.println(i+" occured.. "+frequency);

    }
}
