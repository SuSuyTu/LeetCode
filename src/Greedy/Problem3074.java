package Greedy;

import java.util.Arrays;

public class Problem3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sumApple = 0;
        for (int a : apple) {
            sumApple += a;
        }

        int count = 0;
        int index = capacity.length - 1;
        while (sumApple > 0) {
            sumApple -= capacity[index];
            index--;
            count++;
        }
        return count;
    }
}
