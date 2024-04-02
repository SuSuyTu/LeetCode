package StringProblem;

import java.util.Arrays;

public class Problem1528 {
    public static String restoreString(String s, int[] indices) {
        char[] str = s.toCharArray();
        char[] result = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            result[indices[i]] = str[i];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet", indices));
    }
}
