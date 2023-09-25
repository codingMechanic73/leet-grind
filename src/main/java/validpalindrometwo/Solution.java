package validpalindrometwo;

public class Solution {
    public boolean validPalindrome(String s) {
        return isValid(s, 0, s.length() - 1, 1);
    }

    public boolean isValid(String s, int left, int right, int skip) {
        if (left >= right) {
            return true;
        } else if (s.charAt(left) == s.charAt(right)) {
            return isValid(s, left + 1, right - 1, skip);
        } else if (skip != 1) {
            return false;
        }

        return isValid(s, left + 1, right, skip + 1) || isValid(s, left, right - 1, skip + 1);
    }
}
