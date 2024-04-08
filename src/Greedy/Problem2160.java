package Greedy;


import java.util.Arrays;

public class Problem2160 {
    public static int minimumSum(int num) {
        int[] split_digits = split_digit_list(num);

        return sum(split_digits);

    }
    public static int[] split_digit_list(int num) {
        int[] digits_array = to_array(num);

        return new int[]{digits_array[0] * 10 + digits_array[2], digits_array[1] * 10 + digits_array[3]};

    }

    public static int[] to_array(int num) {
        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            result[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(result);
        return result;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 2239;
        int result = minimumSum(num);
        System.out.println("Minimum Sum: " + result);
    }
}
