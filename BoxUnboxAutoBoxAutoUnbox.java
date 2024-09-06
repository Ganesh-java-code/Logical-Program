package in.ganesh.test;

import java.util.ArrayList;

public class BoxUnboxAutoBoxAutoUnbox {

    public static void main(String[] args){

            // boxing
            int i=10;
            Integer integer = Integer.valueOf(i); // Manual conversion int  premitive to Integer Object wrapper class [Boxing]
            System.out.println(integer);

            // Autoboxing
            int i2=10;
            Integer i1 = i2; // Atomatic conversion int premitive to Integer Object wrapper class
            System.out.println(i1);

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(10); // 10 is premitive automatic conversion to Integer Object [Autoboxing]

            // unboxing
            Integer no = Integer.valueOf(10);
            int no1 = no.intValue(); // manual conversion Integer Object to premitive int value [Unboxing]
            System.out.println(no1);

            // AutoUnboxing
            // ex -1
            Integer i3 = arrayList.get(0); // return Integer but we can assign int as well
            int i4 = arrayList.get(0); //Autounboxing Integer Object converts to int automatically[compiler]
            System.out.println(i4);

            // ex -2
            Integer i5 = Integer.valueOf(10);
            int i6 = i5; // Atomatic Integer Object conversion to int premitive value
            System.out.println(i6);

    }
}
