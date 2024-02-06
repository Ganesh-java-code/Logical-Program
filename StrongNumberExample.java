package in.ganesh.test;

class StrongNumberExample {
    public static void main(String[] args) {

            int rem,sum=0, num=145, temp; //    145=1*1=1 == 1*2*3*4= 24 ==  1*2*3*4*5 = 120   => 1+20+120 = 145
            while(num>0){
                int fact = 1;
                rem=num%10;
                for (int i=1;i<=rem;i++){
                    fact=fact*i;
                }
                sum=sum+fact;
                num /= 10;
            }

        System.out.println(sum);
    }
}