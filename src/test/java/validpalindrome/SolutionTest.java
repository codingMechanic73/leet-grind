package validpalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void validPalindrome(){
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertFalse(solution.isPalindrome("race a car"));
        Assertions.assertTrue(solution.isPalindrome(" "));
    }

}