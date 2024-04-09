package Greedy;

import java.util.Arrays;

public class Problem2144 {
    public static int minimumCost(int[] cost) {
        int n = cost.length;
        int sum = 0;
        Arrays.sort(cost);
        while (n >= 3) {
            sum += cost[n - 1] + cost[n - 2];
            n -= 3;
        }
        if (n == 2) {
            sum += cost[0] + cost[1];
        } else if (n == 1) {
            sum += cost[0];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] cost = {6,5,7,9,2,2};
        System.out.print(minimumCost(cost));
    }
}
