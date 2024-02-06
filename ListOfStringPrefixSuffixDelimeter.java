package in.ganesh.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringPrefixSuffixDelimeter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ganesh", "patil");
        String collect = list.stream().collect(Collectors.joining(" :-> delimeter <-: ", " prefix -> ", " <-suffix "));
        System.out.println(collect);
    }
}
