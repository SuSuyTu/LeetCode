package ArrayProblem;

public class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i+= 1) {
            ans[i * 2] = nums[i];
        }
        int temp = 1;
        for (int i = n; i < 2 * n; i += 1) {
            ans[temp] = nums[i];
            temp += 2;
        }
        return ans;

    }
}
