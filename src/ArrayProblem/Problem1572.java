package ArrayProblem;

public class Problem1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if ((i == j) || (i == mat.length - j - 1)) {
                    sum += mat[i][j];
                }
            }
        }
        if (mat.length % 2 == 0) {
            return sum;
        }
        if (mat.length == 1) {
            return sum;
        }
        return sum;
    }
}
