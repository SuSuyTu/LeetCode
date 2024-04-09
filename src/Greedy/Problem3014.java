package Greedy;

public class Problem3014 {
    public int minimumPushes(String word) {
        int count_pushes = 0;
        int n = word.length();
        while (n != 0) {
            if (n <= 8) {
                count_pushes++;
                n--;
            } else if (n >= 9 && n <= 16) {
                n--;
                count_pushes += 2;
            } else if (n > 16 && n <= 24) {
                n--;
                count_pushes += 3;
            } else {
                n--;
                count_pushes += 4;
            }
        }
        return count_pushes;
    }
}
