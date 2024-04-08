package Greedy;

import java.util.Arrays;

public class Problem1974 {
    public static int minTimeToType(String word) {
        char[] a_z = new char[26];
        char currentChar = 'a';

        for (int i = 0; i < 26; i++) {
            a_z[i] = currentChar;
            currentChar++;
        }

        char[] a_b = new char[26];
        a_b[0] = 'a';
        currentChar = 'z';

        for (int i = 1; i < 26; i++) {
            a_b[i] = currentChar;
            currentChar--;
        }

        int time = word.length() + Math.min(findIndex(a_z, word.charAt(0)), findIndex(a_b, word.charAt(0)));
        for (int i = 0; i < word.length() - 1; i++) {
            time += find_shortest_time(a_b, a_z, word.charAt(i), word.charAt(i + 1));
        }

        return time;
    }

    public static int findIndex(char[] all_char, char ch) {
        for (int i = 0; i < all_char.length; i++) {
            if (all_char[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int find_shortest_time(char[] a_b, char[] a_z, char start, char end) {
        int start_a_b = findIndex(a_b, start);
        int start_a_z = findIndex(a_z, start);
        int end_a_b = findIndex(a_b, end);
        int end_a_z = findIndex(a_z, end);

        int start_end_a_z = Math.abs(end_a_z - start_a_z);
        int start_end_a_b = Math.abs(end_a_b - start_a_b);
        int start_a_b_end_a_z = start_a_b + end_a_z;
        int start_a_z_end_a_b = start_a_z + end_a_b;

        int time1 = Math.min(start_end_a_b, start_end_a_z);
        int time2 = Math.min(start_a_z_end_a_b, start_a_b_end_a_z);

        return Math.min(time1, time2);
    }

    public static void main(String[] args) {
        System.out.print(minTimeToType("zjpc"));
    }
}