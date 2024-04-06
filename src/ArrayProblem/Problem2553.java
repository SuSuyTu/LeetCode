package ArrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2553 {
    public int[] separateDigits(int[] nums) {
        List<Integer> separatedDigitsList = new ArrayList<>();
        List<Integer> reversedDigits = new ArrayList<>();
        for (int num : nums) {
            reversedDigits.clear();
            int i = 0;
            while (num != 0) {
                reversedDigits.add(num % 10);
                num /= 10;
                i++;
            }
            for (int j = reversedDigits.size() - 1; j >= 0; j--) {
                separatedDigitsList.add(reversedDigits.get(j));
            }
        }
        int[] result = new int[separatedDigitsList.size()];
        for (int i = 0; i < separatedDigitsList.size(); i++) {
            result[i] = separatedDigitsList.get(i);
        }
        return result;
    }
}
