package in.ganesh.test;

import io.micrometer.observation.Observation;

import java.util.Map;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BalancedBracketsJava8Approach {
    public static void main(String[] args) {

      String brackets = "{([])}";
        boolean balancedBrkts = BalancedBrkts(brackets);
        if( balancedBrkts ){
            System.out.println("balanced brackets ::");
        }else {
            System.out.println("not balanced brakcets  ::");
        }
    }

    private static boolean BalancedBrkts(String brackets) {

        Map<Character, Character> characterMap = Stream.of(new Object[][]{
                {')', '('},
                {']', '['},
                {'}', '{'}
        }).collect(Collectors.toMap(data -> (Character) data[ 0 ], data -> (Character) data[ 1 ]));

        Stack<Character> stack = new Stack<>();
        char[] charArray = brackets.toCharArray();

        for(char c:charArray){
            if(characterMap.containsValue(c)){
                stack.push(c);
            }else if(characterMap.containsKey(c)){
                if( stack.isEmpty() || stack.pop()!=characterMap.get(c) ){
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
}
