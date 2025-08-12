//print all the subset of set of first n natural numbers

//time complexity-O(2^n)
import java.util.ArrayList;
public class j_82subSetOfSet {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    
    }

public static void findSubSet(int n,ArrayList<Integer>subSet){
    if(n==0){
        printSubset(subSet);
        return;
    }

    //if element want to come
    subSet.add(n);
    findSubSet(n-1, subSet);

    //if element not want to come
    subSet.remove(subSet.size()-1);
    findSubSet(n-1, subSet);

}

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subSet=new ArrayList<>();
        findSubSet(n, subSet);
    }
}
