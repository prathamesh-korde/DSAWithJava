//bubble sorrt panding
public class practicle_1_6 {
    public static void main(String[] args) {
        int[] arr={12,57,6,8};
        int temp;
       
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=i+1;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }


    }
}
