package in.ganesh.test;

import java.util.stream.Stream;

public class FibonacciSeriesUsingJava8Ex {
    public static void main(String[] args) {
//          Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]})
//                    .limit(5) // short-circuit
//                    .map(s -> s[0])
//                    .forEach(System.out::println);
        Stream.iterate(new Integer[]{0,1}, s->new Integer[]{s[1],s[0]+s[1]})
                .limit(10)
                .map(s->s[0])
                .forEach(System.out::println);
    }

}
