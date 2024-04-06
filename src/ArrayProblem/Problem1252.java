package ArrayProblem;

public class Problem1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];

        for (int[] indice : indices) {
            increaseColumn(result, indice[1]);
            increaseRow(result, indice[0]);
        }
        int count = 0;
        for(int[] row : result) {
            for (int value : row) {
                if (value % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public void increaseRow(int[][] result, int row) {
        for (int i = 0; i < result[row].length; i++) {
            result[row][i]++;
        }
    }

    public void increaseColumn(int[][] result, int column) {
        for (int i = 0; i < result.length; i++) {
            result[i][column]++;
        }
    }
}
