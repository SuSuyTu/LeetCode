package ArrayProblem;

import java.util.Arrays;

public class Problem1313 {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i += 2) {
            n += nums[i];
        }
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < nums.length; i+= 2) {
            int[] temp = new int[nums[i]];
            Arrays.fill(temp, nums[i + 1]);
            for (int j = 0; j < temp.length; j++) {
                result[index] = temp[j];
                index += 1;
            }
        }
        return result;
    }
}
