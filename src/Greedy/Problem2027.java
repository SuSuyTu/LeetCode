package Greedy;

public class Problem2027 {
    public int minimumMoves(String s) {
        char[] s_array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            s_array[i] = s.charAt(i);
        }
        int count = 0;
        int index = 0;

        while (index < s_array.length) {
            if (s_array[index] == 'X') {
                count++;
                index += 2;
            }
            index++;
        }
        return count;
    }
}
