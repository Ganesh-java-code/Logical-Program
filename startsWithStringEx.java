package in.ganesh.test;

public class startsWithStringEx {
    public static boolean startsWithTest() {
        String word = "hello world";
        boolean ispresent = false;
        if ( word.startsWith("hello") ) {
             ispresent=true;
        }
        return ispresent;
    }

    public static void main(String[] args) {
        boolean b = startsWithTest();
        System.out.println(b);

    }
}
