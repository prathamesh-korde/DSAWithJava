
import java.util.HashMap;

//given an array of size n, find all the element that appear morde than [n/3] times

public class J_124MajorityEle {
    public static void majority(int num[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= num.length;
        for(int i=0;i<n;i++){
        if(map.containsKey(num[i])){
            map.put(num[i], map.get(num[i])+1);
        }else{
            map.put(num[i], 1);
        }
    }

    for(int key : map.keySet()){
        if(map.get(key)>n/3){
            System.out.println(key);
        }
    }
}
    public static void main(String[] args) {  //O(n)
        int num[] = {1,3,5,3,3,5,5,5};  //1
        majority(num);
    }
}
