package in.ganesh.test;

import java.util.HashMap;

public class RemoveDuplicateElementFromArrayUsingHashMap {

    public static void main(String[] args) {
                int[] arr = {1,2,3,4,1,2,5,7,6,4,5};
        int length = arr.length;
        dupEle(arr,length);
    }

    private static void dupEle(int[] arr, int length) {

        HashMap<Integer,Boolean> map = new HashMap<>();

        for (int i=0;i<length;i++){
            if(map.get(arr[i])==null)
                System.out.println(arr[i]);

            map.put(arr[i],true);
        }
    }
}