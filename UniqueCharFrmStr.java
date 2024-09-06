package in.ganesh.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharFrmStr {
    public static void main(String[] args) {
        String input = "java";
        HashSet<Character> characters = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (Character c:input.toCharArray()){
            if ( characters.add(c) ){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
