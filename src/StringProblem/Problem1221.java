package StringProblem;

public class Problem1221 {
    public int balancedStringSplit(String s) {
        char[] s_array = s.toCharArray();
        int l_count = 0;
        int r_count = 0;
        int result = 0;
        for (char ch : s_array) {
            if (ch == 'L') {
                l_count += 1;
            } else {
                r_count += 1;
            }
            if (l_count == r_count) {
                result += 1;
                l_count = 0;
                r_count = 0;
            }
        }
        return result;
    }
}
