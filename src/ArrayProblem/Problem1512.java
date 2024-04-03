package ArrayProblem;

public class Problem1512 {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result += 1;
                }
            }
        }
        System.gc();
        return result;
    }
}
