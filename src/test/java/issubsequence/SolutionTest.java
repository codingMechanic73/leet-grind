package issubsequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldContainSequence() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void shouldNotContainSequence() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void shouldNotContainSequenceIfEmpty() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isSubsequence("", ""));
    }

}