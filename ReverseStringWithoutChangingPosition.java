package in.ganesh.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringWithoutChangingPosition {
    public static void main(String[] args) {

        // without using java 8
        String name = "Java Programming";
        String[] split = name.split(" ");
        String revString = "";
        for (int i=0;i<split.length;i++){
            String s1 = split[i];
            String revWrd="";
            for (int j=s1.length()-1;j>=0;j--){
                revWrd=revWrd+s1.charAt(j);
            }
            revString=revString+revWrd+" ";
        }
        System.out.println(revString);

        // using java 8
//        String collect = Arrays.stream(name.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
//        System.out.println(collect);

    }
}
