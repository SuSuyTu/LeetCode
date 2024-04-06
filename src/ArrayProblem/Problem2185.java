package ArrayProblem;

public class Problem2185 {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        boolean isMatched;
        for (String word : words) {
            isMatched = isMatched(word, pref);
            if (isMatched) {
                count++;
            }
        }
        return count;
    }

    public boolean isMatched(String word, String pref) {
        if (pref.length() > word.length()) {
            return false;
        }
        for (int i = 0; i < pref.length(); i++) {
            if (word.charAt(i) != pref.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
