package in.ganesh.test;

public class BinarySearchExample1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int target=5;
        int start=arr[0];
        int end=arr.length;
       int result = Search(arr,start,end-1,target);
       if(result==-1){
           System.out.println("element is not present..");
       }else{
           System.out.println("element is present.."+result);
       }
    }

    private static int Search(int[] arr, int start, int end, int target) {

        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

}
