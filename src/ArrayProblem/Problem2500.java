package ArrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2500 {
    public int deleteGreatestValue(int[][] grid) {
        List<List<Integer>> grid_list = convertToList(grid);
        List<Integer> ans = new ArrayList<>();
        int n = grid_list.getFirst().size();
        while (ans.size() != n) {
            int max = 0;
            for (List<Integer> list : grid_list) {
                int max_value = max(list);
                max = Math.max(max, max_value);
                list.remove(list.indexOf(max_value));
            }
            ans.add(max);
        }
        int sum = 0;
        for (int i : ans) {
            sum += i;
        }
        return sum;

    }


    public int max(List<Integer> arr) {
        int max = 0;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }

    public static List<List<Integer>> convertToList(int[][] array) {
        List<List<Integer>> arrayList = new ArrayList<>();
        for (int[] row : array) {
            arrayList.add(new ArrayList<>(Arrays.asList(Arrays.stream(row).boxed().toArray(Integer[]::new))));
        }
        return arrayList;
    }
}
