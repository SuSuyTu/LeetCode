package Greedy;

public class Problem2335 {
    public static int fillCups(int[] amount) {
        int count = 0;
        while (!allZero(amount)) {
            int maxIndex = findMax(amount);

            int other1 = (maxIndex + 1) % 3;
            int other2 = (maxIndex + 2) % 3;

            if (amount[other1] > 0 || amount[other2] > 0) {
                amount[maxIndex]--;
                if (amount[other1] > 0) amount[other1]--;
                else amount[other2]--;
                count++;
            }
            // If no other cups are available, fill the cup with the most liquid
            else {
                amount[maxIndex]--;
                count++;
            }
        }
        return count;
    }

    public static boolean allZero(int[] amount) {
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int findMax(int[] amount) {
        int maxIndex = 0;
        for (int i = 1; i < amount.length; i++) {
            if (amount[i] > amount[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] amount = {5, 4, 4};
        System.out.print(fillCups(amount));
    }

}
