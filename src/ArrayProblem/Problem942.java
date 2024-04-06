package ArrayProblem;

public class Problem942 {
    public int[] diStringMatch(String s) {
        int max = s.length();
        int min = 0;
        int[] result = new int[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = min;
                min++;
            } else {
                result[i] = max;
                max--;
            }
        }
        if (s.charAt(s.length() - 1) == 'I') {
            result[s.length()] = result[s.length() - 1] + 1;
        } else {
            result[s.length()] = result[s.length() - 1] - 1;
        }

        return result;
    }
}
