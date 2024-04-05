package ArrayProblem;

import java.util.Arrays;
import java.util.HashMap;

public class Problem2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> mp = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            mp.put(heights[i], names[i]);
        }

        String[] result = new String[names.length];
        Arrays.sort(heights);

        int count = names.length;
        int index = 0;
        while (count != 0) {
            result[index] = mp.get(heights[count - 1]);
            index++;
            count--;
        }
        return result;
    }
}
