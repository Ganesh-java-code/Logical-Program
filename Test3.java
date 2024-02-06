package in.ganesh.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
class A{
    public void show()throws Exception{
        System.out.println("A class first show method executed...");
    }
}
class B extends A{
    public void show()throws RuntimeException {
        System.out.println("A class second show method executed...");
    }
}
public class Test3 {

    public static void main(String[] args) throws Throwable {

    }
}
