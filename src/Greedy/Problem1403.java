package Greedy;

import java.util.ArrayList;
import java.util.List;

public class Problem1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int sum = 0;
        while (sum < 1 + sum(nums)) {
            int cur = max(nums);
            sum += cur;
            result.add(cur);
            int index = findIndex(nums, cur);
            nums[index] = 0;
        }
        return result;
    }

    public int max(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int findIndex(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
