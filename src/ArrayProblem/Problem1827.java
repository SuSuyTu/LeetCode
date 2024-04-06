package ArrayProblem;

public class Problem1827 {
    public int minOperations(int[] nums) {
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                int miniStep = (nums[i] - nums[i + 1] + 1);
                nums[i + 1] = nums[i + 1] + miniStep;
                step += miniStep;
            }
        }
        return step;
    }
}
