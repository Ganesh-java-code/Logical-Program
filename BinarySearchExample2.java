package in.ganesh.test;

import java.util.Arrays;

public class BinarySearchExample2 {
    public static void main(String[] args) {
        int[] arr = {70,10,2,30,5,60};
        int key = 30;
        Arrays.sort(arr);
        int index = binarySearchEx(arr,key);
        if ( index==-1 ){
            System.out.println("element not present..");
        }else {
            System.out.println("element present at  position :: "+index);
        }
    }

    private static int binarySearchEx(int[] arr, int key) {
        int left = 0;
        int right = arr.length-1;
        while ( left<=right ){
            int mid = left+(right-left)/2;
            if ( arr[mid]==key ){
                return mid;
            }
            if ( arr[mid]<key ){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
