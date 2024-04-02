package StringProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] char_array = words[i].toCharArray();
            for (char ch : char_array) {
                if (ch == x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
