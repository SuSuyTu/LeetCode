package ArrayProblem;

public class Problem1732 {
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
        }
        int max = -10;
        for (int altitude : altitudes) {
            max = Math.max(max, altitude);
        }
        return max;
    }
}
