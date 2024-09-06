package in.ganesh.test;

public class Test1 {
    public static void main(String[] args) {
        Object o ="1234";
        MethodCall(o);
    }

    private static void MethodCall(String ganesh) {
        System.out.println("string method calling...");
    }
    private static void MethodCall(Object ganesh) {
        System.out.println("object method calling..");
    }
}
