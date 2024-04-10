package Greedy;

import java.util.Arrays;

public class Problem976 {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int c = nums[i];
            int b = nums[i - 1];
            int a = nums[i - 2];

            if (isValidTriangle(a, b, c)) {
                return a + b + c;
            }
        }
        return 0;
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        System.out.print(largestPerimeter(nums));
    }
}
