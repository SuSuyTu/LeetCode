package ArrayProblem;

public class Problem2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count_num1 = 0;
        int count_num2 = 0;
        boolean isOccur = false;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    isOccur = true;
                }
            }
            if (isOccur) {
                count_num1++;
            }
            isOccur = false;
        }
        for (int num2 : nums2) {
            for (int num1 : nums1) {
                if (num1 == num2) {
                    isOccur = true;
                }
            }
            if (isOccur) {
                count_num2++;
            }
            isOccur = false;
        }

        int[] ans = {count_num1, count_num2};
        return ans;
    }
}
