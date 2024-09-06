package in.ganesh.test;

import java.util.*;

public class PairNumberSum {
    public static void main(String[] args) {
        Set<Integer> seenNumbers = new HashSet<>();
        int[] arr = {4, 6, 5, -10, 8, 5, 20};
        int targetsum = 10;
        for (Integer i:arr){
            int i1 = targetsum - i; //i1=6
            if ( seenNumbers.contains(i1) ){
                System.out.println("two digit sum eqauls 10 ::"+i+" "+i1);
            }
            seenNumbers.add(i);
        }


    }
}
