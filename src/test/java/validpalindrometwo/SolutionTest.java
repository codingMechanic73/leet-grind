package validpalindrometwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isValidPalindrome() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.validPalindrome("aba"));
        Assertions.assertTrue(solution.validPalindrome("abca"));
        Assertions.assertFalse(solution.validPalindrome("abc"));
    }

}