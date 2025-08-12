import java . util.*;

public class MajorityElement {
    static int majorityElement(int arr[]) {
        int n = arr.length;
        int maxVal=0;
        int majorityElement = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : arr){
            if(!map.containsKey(val))
            map.put(val,1);
            else{
            int newVal = map.get(val)+1;
            map.put(val,newVal);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(maxVal<e.getValue()){
                maxVal=e.getValue();
                majorityElement = e.getKey();
            }
        }
        
        if(maxVal>n/2){
            return majorityElement;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2};
        System.out.println("Majority Element: " + majorityElement(arr));
    }
}
