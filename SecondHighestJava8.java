package in.ganesh.test;

import java.util.*;

public class SecondHighestJava8 {
    public static void main(String[] args) {

       int[] arr = {20,50,100,200,500,800,300}; // 20,50,100,200,300,500,800
        //Comparator<Integer> descOrd = (n1,n2)->-n1.compareTo(n2);
        OptionalInt first = Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst();
        System.out.println(first);


    }
}
