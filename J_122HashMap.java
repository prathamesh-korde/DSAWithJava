import java.util.*;

public class J_122HashMap{
    public static void main(String[] args) {
        //hashmap contains key:value pair where, key is unique
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion-O(1)
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        //print key = value pair (Unordered)
        System.out.println(map);
        
        //update value of existing key-O(1)
        map.put("India",160);
        System.out.println(map);

        //search-O(1)
        if(map.containsKey("China")){
            System.out.println("key is present in map");
        }else{
            System.out.println("key not found");
        }
        
        //get value of key correspondin to key-O(1)
        //if exist(value)
        System.out.println(map.get("China"));
        //if not exist(null)
        System.out.println(map.get("Indo"));

        //iterate within HashMap-way1-O(1)
        System.out.println("iteration way-1");
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //way-2-O(1)
        System.out.println("iteration way-2");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("China");//O(1)
        System.out.println(map);

    }
}