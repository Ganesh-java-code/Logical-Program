package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateCharFromStringWithJava8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ganesh ganesh");
        String s = list.toString();
        String[] strArr = s.split("");
        Map<String, Long> map = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+" occured "+v));
    }
}
