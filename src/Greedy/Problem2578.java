package Greedy;

import java.util.Arrays;

public class Problem2578 {
    public int splitNum(int num) {
        int[] nums = new int[Integer.toString(num).length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(nums);

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                num1.append(nums[i]);
            } else {
                num2.append(nums[i]);
            }
        }
        return Integer.parseInt(String.valueOf(num1)) + Integer.parseInt(String.valueOf(num2));
    }
}
