/*
 Given an array arr[], return true if there is a triplet (a, b, c) from the array (where a, b, and c are on different indexes) that satisfies a2 + b2 = c2, otherwise return false.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PythagoreanTriplet {
    static boolean pythagoreanTriplet(int[] arr) {
        Set<Integer> squareSet = new HashSet<>();
    
    for (int val : arr) {
        squareSet.add(val * val);
    }

    List<Integer> squares = new ArrayList<>(squareSet);
    int n = squares.size();

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int sum = squares.get(i) + squares.get(j);
            if (squareSet.contains(sum)) {
                return true;
            }
        }
    }
     return false;
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 6, 5};
        System.out.println("give array that satisfies a2 + b2 = c2 is "+ pythagoreanTriplet(arr));
    }
}
