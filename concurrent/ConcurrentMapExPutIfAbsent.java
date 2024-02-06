package in.ganesh.test.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExPutIfAbsent {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(101,"ganesh");
        map.putIfAbsent(101,"durga");// key is already present so there is no update
        map.putIfAbsent(102,"durga");// if key is absent then only updation will happen.
        System.out.println(map);
    }
}
