package ArrayProblem;

public class Problem1475 {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            if (isDiscounted(prices, i)) {
                result[i] = prices[i] - nearestPrice(prices, i);
            } else {
                result[i] = prices[i];
            }
        }
        result[result.length - 1] = prices[prices.length - 1];
        return result;
    }

    public boolean isDiscounted(int[] prices, int index) {
        int min = prices[index];
        for (int i = index + 1; i < prices.length; i++) {
            if (min >= prices[i]) {
                return true;
            }
        }
        return false;
    }

    public int nearestPrice(int[] prices, int index) {
        for (int i = index + 1; i < prices.length; i++) {
            if (prices[i] <= prices[index]) {
                return prices[i];
            }
        }
        return 0;
    }
}