package in.ganesh.test.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExRemove {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(101,"durga");
        map.remove(101,"ganesh");//both key and value are present only delete/remove happens
        System.out.println(map);

    }
}
