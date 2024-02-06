package in.ganesh.test;

public class InsertionSortExample {
    public static void main(String[] args) {
            int[] arr = {20,10,15,5,50,1,25,60};
            int n = arr.length;
            sortInsertion(arr,n);
            printArray(arr);
    }

    private static void sortInsertion(int[] arr, int n) {
        for (int i=0;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}