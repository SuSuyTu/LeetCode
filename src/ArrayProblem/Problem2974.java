package ArrayProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2974 {
    public int[] numberGame(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> result_list = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i : nums) {
            temp.add(i);
        }
        for (int i = 0; i < nums.length; i += 2) {
            int lowest = findLowest(temp);
            temp.remove((Integer) lowest);
            int n2Lowest = findLowest(temp);
            temp.remove((Integer) n2Lowest);
            result_list.add(n2Lowest);
            result_list.add(lowest);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = result_list.get(i);
        }
        return result;
    }

    public static int findLowest(List<Integer> temp) {
        int min = 100;
        for (int i : temp) {
            min = Math.min(i, min);
        }
        return min;
    }
}
