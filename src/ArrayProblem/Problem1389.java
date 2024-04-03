package ArrayProblem;

public class Problem1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if (index[i] == i) target[index[i]] = nums[i];

            else {
                for(int j = index[i]; j < i + 1; j++) {
                    int temp = target[j];
                    target[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return target;
    }
}
