package ArrayProblem;

import java.util.Arrays;

public class Problem3065 {
    public int minOperations(int[] nums, int k) {
        int result = 0;
        for (int num : nums) {
            if (num < k) {
                result += 1;
            }
        }
        return result;
    }
}
