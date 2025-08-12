//SELECTION SORT-
//we run aloop an find smallest element and perform only one swap in one loop
//Idea: The inner loop selects the minimum element in the unsorted array and places the elements in increasing order. 
//Time complexity: O(N^2) 
//space complexity-O(1)

public class j_61sort_selection {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);

    }
    
}
