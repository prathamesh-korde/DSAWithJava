//quick sort have two major component Pivot("element at start/end/mid/random") and Partition 
//recursivelly choice a pivot and positionated at right position       
// IMP-worst case- O(n^2) ("when pivot element is always smallest or the largest element")
//avg-time complexity-O(n log(n))
public class j_86quickSort {
    public static int  sort(int[] arr , int low , int high){
        int i=low-1;
        for(int j= low ; j<=high-1;j++){
            if(arr[j]<arr[high]){
                i++;
                //swap
               int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }


public static void quickSort(int[] arr , int low , int high){
    if(low<high){
   int pivotIdx=sort(arr,low,high);  // i
    quickSort(arr, low , pivotIdx-1);
    quickSort(arr, pivotIdx+1 , high);
    }
}
    public static void main(String[] args) {     
    int arr[] = {4,6,8,3,7,1,2};
    int n = arr.length;
    quickSort(arr,0, n-1);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    System.out.println();

}

}
