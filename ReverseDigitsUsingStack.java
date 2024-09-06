package in.ganesh.test;

import java.util.Stack;

public class ReverseDigitsUsingStack {
    public static void main(String[] args) {

        Integer number = 1234567;
        int[] revNumber = revNumber(number);
        for (Integer n:revNumber){
            System.out.print(n+" ");
        }


    }

    private static int[] revNumber(Integer number) {
        Stack<Integer> num=new Stack<>();
        while ( number>0 ){
            num.push(number%10);
            number /= 10;
        }
        return num.stream().mapToInt(Integer::intValue).toArray();


    }
}
