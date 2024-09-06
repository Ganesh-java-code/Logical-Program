package in.ganesh.test;

public class ArmstrongNumberExample {

    public static void main(String[] args) {
        int number = 153,sum=0,rem;
        while ( number>0 ){
            rem=number%10;
            sum=sum+(rem*rem*rem);
            number /= 10;
        }

        System.out.println(sum);
    }
}
