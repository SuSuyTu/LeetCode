package Greedy;

public class Problem2224 {
    public int convertTime(String current, String correct) {
        int[] currentArray = convertStringToArray(current);
        int[] correctArray = convertStringToArray(correct);
        int currentMinutes = convertToMinutes(currentArray);
        int correctMinutes = convertToMinutes(correctArray);
        int count = 0;
        while (currentMinutes != correctMinutes) {
            int dif = correctMinutes - currentMinutes;
            if (dif >= 60) {
                currentMinutes += 60;
                count++;
            } else if ((dif >= 15) && (dif < 60)) {
                currentMinutes += 15;
                count++;
            } else if ((dif >= 5) && (dif < 15)) {
                currentMinutes += 5;
                count++;
            } else {
                currentMinutes += 1;
                count++;
            }
        }
        return count;
    }

    public int[] convertStringToArray(String string) {
        int[] result = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            result[i] = c - '0';
        }
        return result;
    }

    public int convertToMinutes(int[] arr) {
        return  (arr[0] * 10 + arr[1]) * 60 + (arr[3] * 10 + arr[4]);
    }
}
