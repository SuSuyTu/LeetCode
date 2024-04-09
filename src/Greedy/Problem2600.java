package Greedy;

import java.util.ArrayList;
import java.util.List;

public class Problem2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        List<Integer> nums = new ArrayList<>();
        while (numOnes != 0) {
            nums.add(1);
            numOnes--;
        }
        while (numZeros != 0) {
            nums.add(0);
            numZeros--;
        }
        while (numNegOnes != 0) {
            nums.add(-1);
            numNegOnes--;
        }
        int sum = 0;
        int index = 0;
        while (k != 0) {
            sum += nums.get(index);
            k--;
            index++;
        }
        return sum;
    }
}
