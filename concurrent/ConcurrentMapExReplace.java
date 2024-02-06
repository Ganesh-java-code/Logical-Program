package in.ganesh.test.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExReplace {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(101,"durga");
        map.replace(101,"durga","ganesh");
        System.out.println(map);
    }
}
