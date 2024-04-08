package Greedy;

import java.util.ArrayList;
import java.util.List;

public class Problem2357 {
    public int minimumOperations(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num != 0 && !result.contains(num)) {
                result.add(num);
            }
        }
        return result.size();
    }

}
