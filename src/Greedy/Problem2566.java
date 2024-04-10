package Greedy;

public class Problem2566 {
    public int minMaxDifference(int num) {
        int[] max = convertNumberToDigits(num);
        for (int i = 0; i < max.length; i++) {
            if (max[i] != 9) {
                replaceAll(max, 9, max[i]);
                break;
            }
        }

        int[] min = convertNumberToDigits(num);
        for (int i = 0; i < min.length; i++) {
            if (min[i] != 0) {
                replaceAll(min, 0, min[i]);
                break;
            }
        }

        return convertDigitsToNumber(max) - convertDigitsToNumber(min);
    }

    public int[] convertNumberToDigits(int number) {
        String numberString = String.valueOf(number);

        int[] digits = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return digits;
    }

    public void replaceAll(int[] arr, int value, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                arr[i] = value;
            }
        }
    }

    public int convertDigitsToNumber(int[] digits) {
        int number = 0;

        for (int digit : digits) {
            number = number * 10 + digit;
        }

        return number;
    }
}
