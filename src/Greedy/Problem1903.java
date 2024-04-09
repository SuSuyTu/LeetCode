package Greedy;

public class Problem1903 {
    public String largestOddNumber(String num) {
        StringBuilder result = new StringBuilder();

        if (isEven(num)) {
            return "";
        }

        int lastOddIndex = -1;
        for (int i = 0; i < num.length(); i++) {
            result.append(num.charAt(i));
            int c = num.charAt(i);
            int temp = c - '0';
            if (temp % 2 != 0) {
                lastOddIndex = i;
            }
        }
        if (lastOddIndex != num.length() - 1) {
            result.delete(lastOddIndex + 1, result.length());
        }
        return String.valueOf(result);
    }

    public boolean isEven(String num) {
        for (int i = 0; i < num.length(); i++) {
            int c = num.charAt(i);
            int temp = c - '0';
            if (temp % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
