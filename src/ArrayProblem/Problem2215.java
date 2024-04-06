package ArrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        for (int num : nums1) {
            if ((!isContains(nums2, num)) && (!temp1.contains(num))) {
                temp1.add(num);
            }
        }
        result.add(temp1);

        List<Integer> temp2 = new ArrayList<>();
        for (int num : nums2) {
            if ((!isContains(nums1, num)) && (!temp2.contains(num))) {
                temp2.add(num);
            }
        }
        result.add(temp2);

        return result;
    }

    public boolean isContains(int[] nums, int num) {
        for (int i : nums) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
