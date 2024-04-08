package Greedy;

public class Problem1323 {
    public static int maximum69Number(int num) {
        int[] num_array = to_array(num);
        for (int i = 0; i < num_array.length; i++) {
            if (num_array[i] == 6) {
                num_array[i] = 9;
                break;
            }
        }
        int result = 0;
        for (int i = 0; i < num_array.length; i++) {
            result += (int) (num_array[i] * Math.pow(10, num_array.length - i - 1));
        }

        return result;
    }

    public static int[] to_array(int num) {
        int n = Integer.toString(num).length();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = num % 10;
            num /= 10;
        }
        reverseArray(result);
        return result;
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.print(maximum69Number(669));
    }
}
