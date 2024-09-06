package in.ganesh.test;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] num={0,1,0,1,1,0,0,1,0,1,0,0,0,1,1,0};
        SegreagateZeroAndOne(num);
        printArr(num);
    }

    private static void printArr(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }

    private static void SegreagateZeroAndOne(int[] num) {
        int count=0;
        for (int i=0;i<num.length;i++){
            if ( num[i]==0 ){
                count++;
            }
        }
        for (int i=0;i<count;i++){
            num[i]=0;
        }
        for (int i=count;i<num.length;i++){
            num[i]=1;
        }
    }
}
