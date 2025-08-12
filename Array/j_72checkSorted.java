//check if array is sorted (strictly increasing)
//time compllexity-O(n) where n is length of array
public class j_72checkSorted {
    public static boolean sorted(int idx,int[] arr){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return sorted(idx+1, arr);
    }
    public static void main(String[] args) {
        int[] arr={7,8,28,40,64,85};
        if(sorted(0, arr)==true){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
}
}
