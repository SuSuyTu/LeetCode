package ArrayProblem;

import java.util.List;

public class Problem2828 {
    public boolean isAcronym(List<String> words, String s) {
        String temp = "";
        for (String word : words) {
            temp += word.charAt(0);
        }
        return temp.equals(s);
    }
}
