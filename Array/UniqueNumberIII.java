public class UniqueNumberIII {
    public static  int getSingle(int[] arr) {
        int ans=0;
      for(int bitIndex=0;bitIndex<32;bitIndex++){
          int cnt=0;
          for(int i=0;i<arr.length;i++){
              if((arr[i]&(1<<bitIndex))!=0){
                  cnt++;
              }
          }
          if(cnt%3!=0){
              ans=ans|(1<<bitIndex);
          }
      }
      return ans;
  }
  public static void main(String[] args) {
    int[] arr = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1};
    System.out.println("All elements except 3 occurs thrice in the array."+getSingle(arr));
  }
}
