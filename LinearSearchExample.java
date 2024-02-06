package in.ganesh.test;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n = arr.length;
        int target=6;
        int i = SearchLinear(arr, n, target);
        System.out.println(i);
    }

    private static int SearchLinear(int[] arr, int n, int target) {

        for (int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
