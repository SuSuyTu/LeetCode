package ArrayProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] encode = encoded(words);
        List<String> unique_encode = new ArrayList<>();
        for (String word : encode) {
            if (!unique_encode.contains(word)) {
                unique_encode.add(word);
            }
        }
        return unique_encode.size();
    }
    public static String[] encoded(String[] words) {
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('a', ".-");
        mp.put('b', "-...");
        mp.put('c', "-.-.");
        mp.put('d', "-..");
        mp.put('e', ".");
        mp.put('f', "..-.");
        mp.put('g', "--.");
        mp.put('h', "....");
        mp.put('i', "..");
        mp.put('j', ".---");
        mp.put('k', "-.-");
        mp.put('l', ".-..");
        mp.put('m', "--");
        mp.put('n', "-.");
        mp.put('o', "---");
        mp.put('p', ".--.");
        mp.put('q', "--.-");
        mp.put('r', ".-.");
        mp.put('s', "...");
        mp.put('t', "-");
        mp.put('u', "..-");
        mp.put('v', "...-");
        mp.put('w', ".--");
        mp.put('x', "-..-");
        mp.put('y', "-.--");
        mp.put('z', "--..");
        String[] encode = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = 0; j < words[i].length(); j++) {
                temp += mp.get(words[i].charAt(j));
            }
            encode[i] = temp;
        }
        return encode;
    }
}
