package ArrayProblem;

public class Problem1748 {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (isUnique(nums, num)) {
                sum += num;
            }
        }
        return sum;
    }

    public boolean isUnique(int[] nums, int num) {
        int count = 0;
        for (int n : nums) {
            if (n == num) {
                count++;
            }
        }
        return count == 1;
    }
}
