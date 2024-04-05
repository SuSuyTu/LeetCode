package ArrayProblem;

public class Problem2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                count++;
                for (int j = i + 1; j < batteryPercentages.length - 1; j++) {
                    batteryPercentages[j]--;
                }
            }
        }
        return count;
    }
}
