package in.ganesh.test.exceptions;

public class ExceptionTryFinallyEx {
    public static void main(String[] args) {
        try {
            int a=10/0;
            System.out.println(a);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
