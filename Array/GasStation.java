import java.util.Arrays;

public class GasStation {
    public static int startStation(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = Arrays.stream(gas).sum();
        int totalCost = Arrays.stream(cost).sum();
        
        if (totalGas < totalCost) return -1; 
        int start = 0;
        int balance = 0;
        int deficit = 0;
        
        for (int i = 0; i < n; i++) {
            balance += gas[i] - cost[i];
            if (balance < 0) {
                start = i + 1; 
                deficit += balance; 
                balance = 0;
            }
        }
        
        return (balance + deficit >= 0) ? start : -1; 
    }
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println("index of the starting gas station if it's possible to travel around the circuit without running out of gas at any station in a clockwise direction"+ startStation(gas, cost));
    }

}
