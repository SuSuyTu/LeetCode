package ArrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem1725 {
    public int countGoodRectangles(int[][] rectangles) {
        List<Integer> squares = new ArrayList<>();
        for (int[] rectangle : rectangles) {
            squares.add(Math.min(rectangle[0], rectangle[1]));
        }
        int count = 0;
        int max = maxSquare(squares);

        for (int square : squares) {
            if (square == max) {
                count++;
            }
        }
        return count;
    }

    public int maxSquare(List<Integer> squares) {
        int max = 0;
        for (int square : squares) {
            max = Math.max(max, square);
        }
        return max;
    }
}
