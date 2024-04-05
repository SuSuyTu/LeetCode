package ArrayProblem;

import java.util.Arrays;

public class Problem832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = image[i][n - j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}
