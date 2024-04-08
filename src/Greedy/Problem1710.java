package Greedy;

import java.util.Arrays;

public class Problem1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int count = 0;
        int index = 0;
        sorting(boxTypes);
        while ((truckSize != 0) && (index < boxTypes.length)) {
            if (truckSize >= boxTypes[index][0]) {
                count += boxTypes[index][1] * boxTypes[index][0];
                truckSize -= boxTypes[index][0];
                index++;
            } else {
                count += boxTypes[index][1] * truckSize;
                break;
            }
        }
        return count;
    }

    public static void sorting(int[][] boxTypes) {
        for (int i = 0; i < boxTypes.length - 1; i++) {
            for (int j = i + 1; j < boxTypes.length; j++) {
                if (boxTypes[i][1] < boxTypes[j][1]) {
                    int[] temp = Arrays.copyOf(boxTypes[i], boxTypes[i].length);
                    boxTypes[i] = Arrays.copyOf(boxTypes[j], boxTypes[i].length);
                    boxTypes[j] = Arrays.copyOf(temp, boxTypes[i].length);
                }
            }
        }
    }

}
