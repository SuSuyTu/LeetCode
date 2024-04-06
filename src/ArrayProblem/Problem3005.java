package ArrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem3005 {
    public static int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            frequency[i] = countFrequency(nums, nums[i]);
        }

        int maxFreq = maxFrequency(frequency);
        int countMax = countMaxFrequencyElement(frequency, maxFreq, nums);

        return maxFreq * countMax;
    }

    public static int countFrequency(int[] nums, int key) {
        int count = 0;
        for (int num : nums) {
            if (num == key) {
                count += 1;
            }
        }
        return count;
    }

    public static int maxFrequency(int[] frequency) {
        int max = 0;
        for (int i : frequency) {
            max = Math.max(i, max);
        }
        return max;
    }

    public static int countMaxFrequencyElement(int[] frequency, int max, int[] nums) {
        int count = 0;
        List<Integer> distinctElement = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == max) {
                if (!distinctElement.contains(nums[i])) {
                    distinctElement.add(nums[i]);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
}
