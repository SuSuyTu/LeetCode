package StringProblem;

public class Problem2114 {
    public int mostWordsFound(String[] sentences) {
        int max_words = 0;
        for (String word : sentences) {
            char[] word_array = word.toCharArray();
            int temp = 1;
            for (char ch : word_array) {
                if (ch == ' ') {
                    temp += 1;
                }
            }
            if (temp > max_words) {
                max_words = temp;
            }
        }
        return max_words;
    }
}
