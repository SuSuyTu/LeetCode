package ArrayProblem;

public class Problem1979 {
    public int findGCD(int[] nums) {
        return GCD(max(nums), min(nums));
    }

    public int max(int[] num) {
        int max = Integer.MIN_VALUE;
        for (int i : num) {
            max = Math.max(max, i);
        }
        return max;
    }

    public int min(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int i : num) {
            min = Math.min(i, min);
        }
        return min;
    }

    public int GCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
