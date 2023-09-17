package palindrome;

public class Solution {
    private Solution() {
    }

    public boolean isPalindrome(int x) {

        int copyOfX = x;
        int reversed = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }

        return reversed == copyOfX;
    }
}
