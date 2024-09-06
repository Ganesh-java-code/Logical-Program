package in.ganesh.test;

import java.util.ArrayList;
import java.util.List;

public class ObjectArrayFlattenExample {
        public static void main(String[] args) {
            Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10};
            List<Integer> list = flattenObj(array);
            list.forEach(System.out::println);
        }

    private static List<Integer> flattenObj(Object[] array) {

            List<Integer> result = new ArrayList<>();

            for (Object o:array){
                if ( o instanceof Object[] ){
                    result.addAll(flattenObj((Object[]) o));
                }else {
                    result.add((Integer) o);
                }
            }

            return result;
    }

}
