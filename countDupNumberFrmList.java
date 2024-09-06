package in.ganesh.test;


import in.ganesh.model.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class countDupNumberFrmList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(112, 345, 678, 112, 123, 678, 234);

        Map<Integer, Long> numberCountMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Integer, Long> duplicateNumbers = numberCountMap.entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate numbers and there counts :: ");
        duplicateNumbers.forEach((key,value)-> System.out.println("number :"+key+" value :"+value));
    }
}
