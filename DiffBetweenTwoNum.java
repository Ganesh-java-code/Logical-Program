package in.ganesh.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DiffBetweenTwoNum {
   public static void main(String[] args) {
        int[] arr = {6, 8, 3, 4, 10};
       Arrays.sort(arr);
       int i =  arr[ arr.length - 1 ]-arr[ 0 ];
       System.out.println(i);
   }
}
