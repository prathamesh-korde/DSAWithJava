//time complexity-n*Log(n)

public class j_85mergeSort {
    public static void sort(int arr[],int start,int mid,int end){
        int marged[] = new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=end){
            if(arr[idx1]<=arr[idx2]){
                marged[x++]=arr[idx1++];
            }
            else{
                marged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            marged[x++]=arr[idx1++];
        }
        while(idx2<=end){
           marged[x++]=arr[idx2++];
        }
        for (int i = 0, j = start; i < marged.length; i++, j++) {
            arr[j] = marged[i];
        }

    }
public static void divide(int arr[],int start,int end){
    if(start>=end){
        return;
    }
    int mid = start + ( end - start)/2;
    divide(arr, start, mid);
    divide(arr, mid+1, end);
    sort(arr,start,mid,end);

}
    public static void main(String[] args) {
        int arr[] = {5,8,6,2,1,3,0,7};
        int n=arr.length;
        divide(arr,0,n-1);

        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

    }
}
