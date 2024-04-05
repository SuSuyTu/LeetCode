package ArrayProblem;

public class Problem2656 {
    public int maximizeSum(int[] nums, int k) {
        int score = 0;
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }

        while (k != 0) {
            score += max;
            max += 1;
            k--;
        }
        return score;
    }
}
