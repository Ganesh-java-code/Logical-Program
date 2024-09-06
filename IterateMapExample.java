package in.ganesh.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class IterateMapExample {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","b");
        map.put("b","c");
        map.put("d","e");
        map.put("f","g");
        map.put("h","i");
        map.remove("h","i");
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> i:entries){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}