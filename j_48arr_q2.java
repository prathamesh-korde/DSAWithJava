//Find the maximum & minimum number in an array of integers. 

public class j_48arr_q2 {
    public static void main(String[] args) {
        int[] arr={1,5,855,64,755,86,85};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
                if(min>arr[i]){
                    min=arr[i];
            }        
        }
        System.out.println(max);
        System.out.println(min);
    }
    
}
