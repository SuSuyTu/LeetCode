package Greedy;

public class Problem2078 {
    public int maxDistance(int[] colors) {
        int maxDistance = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    maxDistance = Math.max(maxDistance, j - i);
                }
            }
        }
        return maxDistance;
    }
}
