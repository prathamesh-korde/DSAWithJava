import java.util.Arrays;

public class AbsoluteDifference {
    public void rearrange(int[] arr, int x) {
        // code here
         Integer[] array = new Integer[arr.length];

        for(int i=0; i< arr.length; i++){

            array[i] = arr[i];

        }

        Arrays.sort(array,(a,b) -> Integer.compare(Math.abs(x-a),Math.abs(x-b)));



        for(int i=0; i<arr.length; i++){

            arr[i] = array[i];

        }
    }
    public static void main(String[] args) {
        AbsoluteDifference absoluteDifference = new AbsoluteDifference();
        int[] arr = {10, 20, 30, 40};
        int x = 25;
        absoluteDifference.rearrange(arr, x);
        System.out.println(Arrays.toString(arr)); // Output: [20, 30, 10, 40]
    }
}
