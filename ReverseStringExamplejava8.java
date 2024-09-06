package in.ganesh.test;

import java.util.Arrays;

public class ReverseStringExamplejava8 {
    public static void main(String[] args) {
        String name = "Java Programming learn";
        String revStr = Arrays.stream(name.split(" ")).reduce((first, second) -> second + " " + first).orElse(" ");
        System.out.println(revStr);
        //System.out.println(collect);
    }
}
