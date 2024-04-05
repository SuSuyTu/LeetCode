package ArrayProblem;

public class Problem1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 0; j < points[0].length - 1; j++) {
                result += Math.max(Math.abs(points[i][j] - points[i + 1][j]), Math.abs(points[i][j + 1] - points[i + 1][j + 1]));
            }
        }
        return result;
    }
}
