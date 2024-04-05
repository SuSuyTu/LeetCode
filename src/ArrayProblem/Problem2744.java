package ArrayProblem;

public class Problem2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(reversed(words[j]))) {
                    result++;
                }
            }
        }
        return result;
    }

    public static String reversed(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }
}
