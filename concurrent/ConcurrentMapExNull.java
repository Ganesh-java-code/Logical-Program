package in.ganesh.test.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExNull {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(null,null);
        System.out.println(map);
    }
}
