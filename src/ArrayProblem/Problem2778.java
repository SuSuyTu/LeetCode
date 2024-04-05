package ArrayProblem;

public class Problem2778 {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                sum += nums[i - 1] * nums[i - 1];
            }
        }
        return sum;
    }
}
