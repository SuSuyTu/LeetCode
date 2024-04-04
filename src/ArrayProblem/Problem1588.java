package ArrayProblem;

public class Problem1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int final_sum = 0;
        for (int i = 1; i <= arr.length; i+=2) {
            final_sum += sumOfSlidingWindow(arr, i);
        }
        return final_sum;
    }

    public static int sumOfSlidingWindow(int[] arr, int size) {
        int currSum = 0;
        int absSum = 0;

        for (int j = 0; j < size; j++) {
            currSum += arr[j];
        }
        absSum += currSum;
        for (int j = size; j < j + size && j < arr.length; j++) {
            currSum = currSum - arr[j - size] + arr[j];
            absSum += currSum;
        }
        return absSum;
    }
}
