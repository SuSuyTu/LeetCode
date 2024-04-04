package ArrayProblem;

public class Problem2535 {
    public int differenceOfSum(int[] nums) {
        int sum_num = 0;
        int sum_digit = 0;
        for (int num : nums) {
            sum_num += num;
            int temp = num;
            while (temp > 0) {
                sum_digit += temp % 10;
                temp = temp / 10;
            }
        }
        return sum_num - sum_digit;
    }

}
