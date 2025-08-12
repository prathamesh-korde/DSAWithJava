//find the number of ways in which you can invite n people
//to your party,single or in pair

public class j_81partylEntry {
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        //single
        int way1=callGuests(n-1)*1;

        //pair
        int way2=callGuests(n-2)*(n-1);

        return  way1+way2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuests(n));
    }
}
