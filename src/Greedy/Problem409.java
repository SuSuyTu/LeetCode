package Greedy;

import java.util.HashMap;

public class Problem409 {
    public int longestPalindrome(String s) {
        int sLen = s.length();
        if (isPalindrome(s)) {
            return sLen;
        }

        HashMap<Character, Integer> chars = new HashMap<>();
        int palindromeLength = 0;

        // Đếm số lần xuất hiện của từng ký tự trong chuỗi
        for (int i = 0; i < sLen; i++) {
            char currentChar = s.charAt(i);
            chars.put(currentChar, chars.getOrDefault(currentChar, 0) + 1);
            if (chars.get(currentChar) % 2 == 0) {
                palindromeLength += 2;
            }
        }

        // Nếu có ký tự nào còn lại, thêm vào palindrome
        return (sLen - palindromeLength != 0) ? palindromeLength + 1 : palindromeLength;
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
