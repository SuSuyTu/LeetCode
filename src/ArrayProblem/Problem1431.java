package ArrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandy(candies, candy));
        }
        return result;
    }

    public static int maxCandy(int[] candies, int max) {
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }
}
