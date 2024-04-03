package ArrayProblem;

import java.util.List;

public class Problem2824 {
    public int countPairs(List<Integer> nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    result += 1;
                }
            }
        }
        return result;
    }
}
