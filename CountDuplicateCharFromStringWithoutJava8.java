package in.ganesh.test;

import java.util.*;

public class CountDuplicateCharFromStringWithoutJava8 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ganesh","ganesh");
        String s = list.toString();
        char[] charArray = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for (char i:charArray){
            if (Character.isAlphabetic(i)){
                if (map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }else {
                    map.put(i,1);
                }
            }
        }
        System.out.println(map);
   }
}
